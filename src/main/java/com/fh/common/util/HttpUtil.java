package com.fh.common.util;

import org.apache.http.*;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import javax.net.ssl.SSLContext;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HttpUtil {
	
	public static void ssl() {
		CloseableHttpClient httpclient = null;
		try {
			KeyStore trustStore = KeyStore.getInstance(KeyStore
					.getDefaultType());
			FileInputStream instream = new FileInputStream(new File(
					"d:\\tomcat.keystore"));
			try {
				// 加载keyStore d:\\tomcat.keystore
				trustStore.load(instream, "123456".toCharArray());
			} catch (CertificateException e) {
				e.printStackTrace();
			} finally {
				try {
					instream.close();
				} catch (Exception ignore) {
				}
			}
			// 相信自己的CA和所有自签名的证书
			SSLContext sslcontext = SSLContexts
					.custom()
					.loadTrustMaterial(trustStore,
							new TrustSelfSignedStrategy()).build();
			// 只允许使用TLSv1协议
			SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(
					sslcontext,
					new String[] { "TLSv1" },
					null,
					SSLConnectionSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
			httpclient = HttpClients.custom().setSSLSocketFactory(sslsf)
					.build();
			// 创建http请求(get方式)
			HttpGet httpget = new HttpGet(
					"https://localhost:8443/myDemo/Ajax/serivceJ.action");
			System.out.println("executing request" + httpget.getRequestLine());
			CloseableHttpResponse response = httpclient.execute(httpget);
			try {
				HttpEntity entity = response.getEntity();
				System.out.println("----------------------------------------");
				System.out.println(response.getStatusLine());
				if (entity != null) {
					System.out.println("Response content length: "
							+ entity.getContentLength());
					System.out.println(EntityUtils.toString(entity));
					EntityUtils.consume(entity);
				}
			} finally {
				response.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (KeyManagementException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (KeyStoreException e) {
			e.printStackTrace();
		} finally {
			if (httpclient != null) {
				try {
					httpclient.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * post方式提交表单（模拟用户登录请求）
	 */
	public void postForm() {
		// 创建默认的httpClient实例.
		CloseableHttpClient httpclient = HttpClients.createDefault();
		// 创建httppost
		HttpPost httppost = new HttpPost(
				"http://localhost:8080/myDemo/Ajax/serivceJ.action");
		// 创建参数队列
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("username", "admin"));
		formparams.add(new BasicNameValuePair("password", "123456"));
		UrlEncodedFormEntity uefEntity;
		try {
			uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");
			httppost.setEntity(uefEntity);
			System.out.println("executing request " + httppost.getURI());
			CloseableHttpResponse response = httpclient.execute(httppost);
			try {
				HttpEntity entity = response.getEntity();
				if (entity != null) {
					System.out
							.println("--------------------------------------");
					System.out.println("Response content: "
							+ EntityUtils.toString(entity, "UTF-8"));
					System.out
							.println("--------------------------------------");
				}
			} finally {
				response.close();
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 关闭连接,释放资源
			try {
				httpclient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 发送 post请求访问本地应用并根据传递参数不同返回不同结果
	 */
	public static String post(String url, Map<String, Object> datas) {
		// 创建默认的httpClient实例.
		CloseableHttpClient httpclient = HttpClients.createDefault();
		// 创建httppost
		HttpPost httppost = new HttpPost(url);
		
		// 创建参数队列
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		for (Entry<String, Object> data : datas.entrySet()) {
			formparams.add(new BasicNameValuePair(data.getKey(),data.getValue().toString()));
		}
		UrlEncodedFormEntity uefEntity;
		try {
			uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");
			
			httppost.setEntity(uefEntity);
//			System.out.println("executing request " + httppost.getURI());
			CloseableHttpResponse response = httpclient.execute(httppost);
			try {
				HttpEntity entity = response.getEntity();
				if (entity != null) {
					return EntityUtils.toString(entity,"UTF-8");
				}
			} finally {
				response.close();
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 关闭连接,释放资源
			try {
				httpclient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	/**
	 * 发送输出流请求
	 * @param url 地址
	 * @param data 数据流
	 * @throws IOException
	 */
	public static String postWrite(String url, String data) throws IOException{
		String strResult = "";
	    InputStream inStream = null;
	    PrintWriter out = null;
	    URL httpurl = new URL(url);
	      
	      HttpURLConnection httpConn = (HttpURLConnection) httpurl.openConnection();
	      httpConn.setRequestMethod("POST");
	      httpConn.setDoOutput(true);
	      httpConn.setDoInput(true);
	 
	      System.out.println("executing request " + url+"/t data="+data);
	      
	      out = new PrintWriter( new OutputStreamWriter(httpConn.getOutputStream(),"UTF-8"));
	      out.write(data);
	      out.flush();
	      out.close();
	      inStream = httpConn.getInputStream();
	      StringBuffer strBuffer = new StringBuffer();
	      int nByte;
	      while ( (nByte = inStream.read()) != -1) {
	        strBuffer.append( (char) nByte);
	      }
	      strResult = strBuffer.toString();
	      inStream.close();
		return strResult;
	}
	

	/**
	 * 发送 get请求
	 */
	public static String get(String url) {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		try {
			// 创建httpget.
			HttpGet httpget = new HttpGet(url);
			// 执行get请求.
			CloseableHttpResponse response = httpclient.execute(httpget);
			try {
				// 获取响应实体
				HttpEntity entity = response.getEntity();
				if (entity != null) {
					return EntityUtils.toString(entity,"UTF-8");
				}
			} finally {
				response.close();
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 关闭连接,释放资源
			try {
				httpclient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	/**
	 * 上传文件
	 * @param requestUrl
	 * @param file
	 * @return
	 * @throws IOException
	 */
	public static String upload(String requestUrl, File file) throws IOException {
		// 向服务器发送post请求  
        URL url = new URL(requestUrl);  
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();  
  
        // 发送POST请求必须设置如下两行  
        // 头  
        String boundary = "----------" +System.currentTimeMillis();  

        // 尾  
        String endBoundary = "\r\n--" + boundary + "--\r\n"; 
        
        connection.setDoOutput(true);  
        connection.setDoInput(true);  
        connection.setUseCaches(false);  
        connection.setRequestMethod("POST");  
        connection.setRequestProperty("Connection", "Keep-Alive");  
        connection.setRequestProperty("Charset", "UTF-8");  
        connection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);  
        OutputStream out = connection.getOutputStream();  
        
        // 传输内容  
        StringBuffer contentBody = new StringBuffer("--" + boundary);  
  
        // 1. 处理文字形式的POST请求  
  
        /*for (FormFieldKeyValuePair ffkvp : generalFormFields)  
  
        {  
  
            contentBody.append("\r\n")  
  
            .append("Content-Disposition: form-data; name=\"")  
  
            .append(ffkvp.getKey() + "\"")  
  
            .append("\r\n")  
  
            .append("\r\n")  
  
            .append(ffkvp.getValue())  
  
            .append("\r\n")  
  
            .append("--")  
  
            .append(boundary);  
  
        }  
  
        String boundaryMessage1 = contentBody.toString();  
  
        out.write(boundaryMessage1.getBytes("utf-8"));  */
  
        // 2. 处理文件上传  
            contentBody = new StringBuffer();  
            contentBody.append("\r\n").append("--").append(boundary).append("\r\n")
            	.append("Content-Disposition:form-data; name=\"media\"; ")  
            	.append("filename=\"").append(file.getName() + "\"") // 上传文件的文件名，包括目录  
            	.append("\r\n")  
            	.append("Content-Type:application/octet-stream")  
            	.append("\r\n\r\n");  
            String boundaryMessage2 = contentBody.toString();  
            out.write(boundaryMessage2.getBytes("utf-8"));  
  
            // 开始真正向服务器写文件    
            DataInputStream dis = new DataInputStream(new FileInputStream(file));  
            int bytes = 0;  
            byte[] bufferOut = new byte[1024];
            while ((bytes = dis.read(bufferOut)) != -1) {
            	out.write(bufferOut, 0, bytes);
            } 
            dis.close();  
  
        // 3. 写结尾  
        out.write(endBoundary.getBytes("utf-8"));  
        out.flush();  
        out.close();  
  
        // 4. 从服务器获得回答的内容  
        String strLine = "";  
        String strResponse = "";  
        InputStream in = connection.getInputStream();  
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));  
        while ((strLine = reader.readLine()) != null){  
            strResponse += strLine + "\n";  
        }  
        return strResponse;
	}
	
    /**
     * 下载文件保存到本地 
     *  
     * @param path
     *            文件保存位置
     * @param url
     *            文件地址
     * @throws IOException
     */
	public static void downloadFile(String path, String url) throws IOException {
        //log.debug("path:" + path);
        //log.debug("url:" + url);
        //HttpClient client = null;
        CloseableHttpClient client = HttpClients.createDefault();
        try {
            // 创建HttpClient对象
            //client = new  CloseableHttpClient();
            //CloseableHttpClient httpclient = HttpClients.createDefault();
            // 获得HttpGet对象
            //HttpGet httpGet = getHttpGet(url, null, null);
            HttpGet httpGet = new HttpGet(url);
            // 发送请求获得返回结果
            HttpResponse response = client.execute(httpGet);
            // 如果成功
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                byte[] result = EntityUtils.toByteArray(response.getEntity());
                BufferedOutputStream bw = null;
                try {
                    // 创建文件对象
                    File f = new File(path);
                    // 创建文件路径
                    if (!f.getParentFile().exists())
                        f.getParentFile().mkdirs();
                    // 写入文件
                    bw = new BufferedOutputStream(new FileOutputStream(path));
                    bw.write(result);
                } catch (Exception e) {
                    //log.error("保存文件错误,path=" + path + ",url=" + url, e);
                } finally {
                    try {
                        if (bw != null)
                            bw.close();
                    } catch (Exception e) {
                        //log.error("finally BufferedOutputStream shutdown close",e);
                    }
                }
            }
            // 如果失败
            else {
                StringBuffer errorMsg = new StringBuffer();
                errorMsg.append("httpStatus:");
                errorMsg.append(response.getStatusLine().getStatusCode());
                errorMsg.append(response.getStatusLine().getReasonPhrase());
                errorMsg.append(", Header: ");
                Header[] headers = response.getAllHeaders();
                for (Header header : headers) {
                    errorMsg.append(header.getName());
                    errorMsg.append(":");
                    errorMsg.append(header.getValue());
                }
                //log.error("HttpResonse Error:" + errorMsg);
            }
        } catch (ClientProtocolException e) {
            //log.error("下载文件保存到本地,http连接异常,path=" + path + ",url=" + url, e);
            throw e;
        } catch (IOException e) {
            //log.error("下载文件保存到本地,文件操作异常,path=" + path + ",url=" + url, e);
            throw e;
        } finally {
            try {
                //client.getConnectionManager().shutdown();
                client.close();
            } catch (Exception e) {
                //log.error("finally HttpClient shutdown error", e);
            }
        }
    }
	
	public static void main(String[] args) throws UnsupportedEncodingException {
//		String url = "http://wx.landinghuo.com/xxd_sas/api/v1/mechant/goods/addCheck?specificationValues=[{%22speName%22:%22%22,%22productNo%22:%22W1JN%22,%22barCode%22:%226930305500490%22,%22price%22:23.50,%22costPrice%22:0.00,%22stock%22:9999,%22anotherPrice%22:{%22levelPrices%22:[{%22level%22:%221%22,%22levelPrice%22:%2218.8%22}],%22customerPrices%22:[]}}]&title=20&pics=1&cateId=12&adminId=1&loginToken=7w9CKXaDH_74mSNEFLnVNlUg2Qs_KXjjs&isBusiness=0";
		String url = "http://wx.landinghuo.com/xxd/api/v1/mechant/goods/addCheck";
		Map<String, Object> params = new HashMap<String, Object>();
//		&title=20&pics=1&cateId=12&adminId=1&loginToken=7w9CKXaDH_74mSNEFLnVNlUg2Qs_KXjjs&isBusiness=0
		params.put("title", "20");
		params.put("pics", "1");
		params.put("cateId", "1");
		params.put("adminId", "1");
		params.put("isBusiness", "0");
		params.put("loginToken", "7w9CKXaDH_74mSNEFLnVNlUg2Qs_KXjjs");
		params.put("specificationValues", "[{%22speName%22:%22%22,%22productNo%22:%%22,%22barCode%22:%226930305500490%22,%22price%22:23.50,%22costPrice%22:0.00,%22stock%22:9999,%22anotherPrice%22:{%22levelPrices%22:[{%22level%22:%221%22,%22levelPrice%22:%2218.8%22}],%22customerPrices%22:[]}}]");
		String result = post(url, params);
		System.out.println(result);
//		String sp = URLEncoder.encode("[{%22speName%22:%22%22,%22productNo%22:%22W1JN%22,%22barCode%22:%226930305500490%22,%22price%22:23.50,%22costPrice%22:0.00,%22stock%22:9999,%22anotherPrice%22:{%22levelPrices%22:[{%22level%22:%221%22,%22levelPrice%22:%2218.8%22}],%22customerPrices%22:[]}}]", "utf-8");
//		String sp = URLDecoder.decode("[{%22speName%22:%22%22,%22productNo%22:%22W1JN%22,%22barCode%22:%226930305500490%22,%22price%22:23.50,%22costPrice%22:0.00,%22stock%22:9999,%22anotherPrice%22:{%22levelPrices%22:[{%22level%22:%221%22,%22levelPrice%22:%2218.8%22}],%22customerPrices%22:[]}}]", "utf-8");
//		System.out.println(sp);
	}
}
