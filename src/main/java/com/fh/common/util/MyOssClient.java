package com.fh.common.util;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.GetObjectRequest;
import com.aliyun.oss.model.ListObjectsRequest;
import com.aliyun.oss.model.OSSObject;
import com.aliyun.oss.model.ObjectListing;
import com.aliyun.oss.model.ObjectMetadata;
import com.aliyun.oss.model.PutObjectResult;
import com.fh.common.constants.SysConstants;

public class MyOssClient {
	public static String OSS_KEY = SysConstants.OSS_KEY;
	public static String OSS_SECRET = SysConstants.OSS_SECRET;
	public static String OSS_BUCKET = SysConstants.OSS_BUCKET;
	public static String OSS_ENDPOINT = SysConstants.OSS_ENDPOINT;
	public static String OSS_IMG_ENDPOINT = SysConstants.OSS_IMG_ENDPOINT;
	private static OSSClient client;
	private static final String BASE_PATH = SysConstants.FILE_PATH + "/temp/";
	protected static Log logger = LogFactory.getLog(MyOssClient.class);
	public static Map<String, OSSClient> clients = new HashMap<String, OSSClient>();
	static {
		initial();
	}

	private static void initial() {
		client = new OSSClient(OSS_ENDPOINT, OSS_KEY, OSS_SECRET);
		
		if(client == null){
			logger.info("OSS服务开启失败，请确认参数是否正确");
		}else{
			logger.info("OSS服务已开启");
		}
	}

	public static boolean putObject(String key,String mime, byte[] data, String bucketName, String fileName) throws IOException {
		if(StringUtils.isBlank(bucketName))bucketName = OSS_BUCKET;
		InputStream content = new ByteArrayInputStream(data);
		ObjectMetadata meta = new ObjectMetadata();
		meta.setContentLength(data.length);
		meta.setContentDisposition("filename="+ URLEncoder.encode(fileName, "UTF-8"));
		if(StringUtils.isNotBlank(mime))meta.setContentType(mime+"; charset=utf-8");
		PutObjectResult result = client.putObject(bucketName, key, content, meta);
		return result != null;
	}

	public static boolean putObject(String key,String mime, InputStream in, String bucketName, String fileName) throws IOException {
		if(StringUtils.isBlank(bucketName))bucketName = OSS_BUCKET;
		ObjectMetadata meta = new ObjectMetadata();
		meta.setContentLength(in.available());
		meta.setContentDisposition("filename="+ URLEncoder.encode(fileName, "UTF-8"));
		if(StringUtils.isNotBlank(mime))meta.setContentType(mime+"; charset=utf-8");
		PutObjectResult result = client.putObject(bucketName, key, in, meta);
		return result != null;
	}

	public static InputStream getObjectStream(String key, String bucketName) throws IOException {
		if(StringUtils.isBlank(bucketName))bucketName = OSS_BUCKET;
		OSSObject object = null;
		InputStream objectContent = null;
		try {
			object = client.getObject(bucketName, key);
			objectContent = object.getObjectContent();
		} catch (Throwable e) {
			if (objectContent != null) {
				objectContent.close();
			}
			return null;
		}

		return objectContent;
	}
	
	public static byte[] getObject(String key, String bucketName) throws IOException {
		if(StringUtils.isBlank(bucketName))bucketName = OSS_BUCKET;
		OSSObject object = null;
		byte[] data = (byte[]) null;
		InputStream objectContent = null;
		try {
			object = client.getObject(bucketName,key);
			objectContent = object.getObjectContent();
			data = getByteFromFile(key, objectContent);
			objectContent.read(data);
		} catch (Exception e) {
			return null;
		} finally {
			if (objectContent != null) {
				objectContent.close();
			}
		}
		return data;
	}

	public static byte[] getObject(String key, String bucketName,long start,long end) throws IOException {
		if(StringUtils.isBlank(bucketName))bucketName = OSS_BUCKET;
		OSSObject object = null;
		byte[] data = (byte[]) null;
		InputStream objectContent = null;
		try {
			// 新建 GetObjectRequest
			GetObjectRequest getObjectRequest = new GetObjectRequest(bucketName, key);
			// 获取 0~100 字节范围内的数据
			if(start!=0 && end!=0)
				getObjectRequest.setRange(start,end);
			// 获取 Object，返回结果为 OSSObject 对象
			object = client.getObject(getObjectRequest);
			objectContent = object.getObjectContent();
			data = getByteFromFile(key, objectContent);
			objectContent.read(data);
		} catch (Exception e) {
			return null;
		} finally {
			if (objectContent != null) {
				objectContent.close();
			}
		}
		return data;
	}

	public static BufferedImage getObjectImg(String key, String bucketName) throws IOException {
		if(StringUtils.isBlank(bucketName))bucketName = OSS_BUCKET;
		OSSObject object = null;
		BufferedImage bimg = null;
		InputStream objectContent = null;
		try {
			object = client.getObject(bucketName, key);
			objectContent = object.getObjectContent();
			bimg = ImageIO.read(objectContent);
		} catch (Throwable e) {
			return null;
		} finally {
			if (objectContent != null) {
				objectContent.close();
			}
		}
		return bimg;
	}

	public static byte[] getByteFromFile(String filename, InputStream in) throws IOException {
		byte[] data = (byte[]) null;
		File file = new File(BASE_PATH + "/" + filename);
		if (!file.exists()) {
			file.getParentFile().mkdirs();
			file.createNewFile();
		}
		FileOutputStream fout = new FileOutputStream(file);
		byte[] buff = new byte[1024];
		int len = 0;
		while ((len = in.read(buff)) > 0) {
			fout.write(buff, 0, len);
		}
		fout.close();
		data = FileUtils.readFileToByteArray(file);

		if (file.exists())
			file.delete();
		return data;
	}

	public static void deleteObject(String key, String bucketName) {
		if(StringUtils.isBlank(bucketName))bucketName = OSS_BUCKET;
		client.deleteObject(bucketName, key);
	}

	public static ObjectListing listObject(String prefix, String bucketName) {
		if(StringUtils.isBlank(bucketName))bucketName = OSS_BUCKET;
		ListObjectsRequest listObjectsRequest = new ListObjectsRequest(bucketName);
		listObjectsRequest.setPrefix(prefix);
		return client.listObjects(listObjectsRequest);
	}

	public static String getHttpUrl() {
		return "http://"+OSS_BUCKET+"."+OSS_ENDPOINT+"/";
	}
	public static String getImgHttpUrl() {
		return "http://"+OSS_BUCKET+"."+OSS_IMG_ENDPOINT+"/";
	}
	public static String redirect(String id) {
		return getHttpUrl()+id;
	}
}