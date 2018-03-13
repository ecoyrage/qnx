package com.fh.common.util;

import org.apache.http.*;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import javax.net.ssl.*;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
 
public class HttpClientUtils {
	public static String get(String reqURL){
		String respContent = "通信失败"; //响应内容
		HttpClient httpClient = new DefaultHttpClient(); //创建默认的httpClient实例
		httpClient.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, 10000); //连接超时10s
		httpClient.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT, 20000);         //读取超时20s
		HttpGet httpGet = new HttpGet(reqURL); //创建org.apache.http.client.methods.HttpGet
		try{
			HttpResponse response = httpClient.execute(httpGet); //执行GET请求
			HttpEntity entity = response.getEntity();            //获取响应实体
			if(null != entity){
				Charset respCharset = ContentType.getOrDefault(entity).getCharset();
				respContent = EntityUtils.toString(entity, respCharset);
				EntityUtils.consume(entity);
			}
			System.out.println("-------------------------------------------------------------------------------------------");
			StringBuilder respHeaderDatas = new StringBuilder();
			for(Header header : response.getAllHeaders()){
				respHeaderDatas.append(header.toString()).append("\r\n");
			}
			String respStatusLine = response.getStatusLine().toString(); //HTTP应答状态行信息
			String respHeaderMsg = respHeaderDatas.toString().trim();    //HTTP应答报文头信息
			String respBodyMsg = respContent;                            //HTTP应答报文体信息
			System.out.println("HTTP应答完整报文=[" + respStatusLine + "\r\n" + respHeaderMsg + "\r\n\r\n" + respBodyMsg + "]");
			System.out.println("-------------------------------------------------------------------------------------------");
		} catch (ConnectTimeoutException cte){
		} catch (SocketTimeoutException ste){
		}catch(ClientProtocolException cpe){
		}catch(ParseException pe){
		}catch(IOException ioe){
		}catch (Exception e){
		}finally{
			httpClient.getConnectionManager().shutdown();
		}
		return respContent;
	}
	public static String sendPostRequest(String reqURL, String reqData, String encodeCharset){
		String reseContent = "通信失败";
		HttpClient httpClient = new DefaultHttpClient();
		httpClient.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, 10000);
		httpClient.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT, 20000);
		HttpPost httpPost = new HttpPost(reqURL);
		httpPost.setHeader(HTTP.CONTENT_TYPE, "application/x-www-form-urlencoded; charset=" + encodeCharset);
		try{
			httpPost.setEntity(new StringEntity(reqData==null?"":reqData, encodeCharset));
			HttpResponse response = httpClient.execute(httpPost);
			HttpEntity entity = response.getEntity();
			if (null != entity) {
				reseContent = EntityUtils.toString(entity, ContentType.getOrDefault(entity).getCharset());
				EntityUtils.consume(entity);
			}
		} catch (ConnectTimeoutException cte){
		} catch (SocketTimeoutException ste){
		}catch(Exception e){
		}finally{
			httpClient.getConnectionManager().shutdown();
		}
		return reseContent;
	}
	
	public static String sendPostSSLRequest(String reqURL, Map<String, String> params, String encodeCharset){
		String responseContent = "通信失败";
		HttpClient httpClient = new DefaultHttpClient();
		httpClient.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, 10000);
		httpClient.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT, 20000);
		X509TrustManager trustManager = new X509TrustManager(){
			@Override
			public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {}
			@Override
			public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {}
			@Override
			public X509Certificate[] getAcceptedIssuers() {return null;}
		};
		X509HostnameVerifier hostnameVerifier = new X509HostnameVerifier(){
			@Override
			public void verify(String host, SSLSocket ssl) throws IOException {}
			@Override
			public void verify(String host, X509Certificate cert) throws SSLException {}
			@Override
			public void verify(String host, String[] cns, String[] subjectAlts) throws SSLException {}
			@Override
			public boolean verify(String arg0, SSLSession arg1) {return true;}
		};
		try {
			SSLContext sslContext = SSLContext.getInstance(SSLSocketFactory.TLS);
			sslContext.init(null, new TrustManager[]{trustManager}, null);
			SSLSocketFactory socketFactory = new SSLSocketFactory(sslContext, hostnameVerifier);
			httpClient.getConnectionManager().getSchemeRegistry().register(new Scheme("https", 443, socketFactory));
			HttpPost httpPost = new HttpPost(reqURL);
			if(null != params){
				List<NameValuePair> formParams = new ArrayList<NameValuePair>();
				for(Map.Entry<String,String> entry : params.entrySet()){
					formParams.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
				}
				httpPost.setEntity(new UrlEncodedFormEntity(formParams, encodeCharset));
			}
			HttpResponse response = httpClient.execute(httpPost);
			HttpEntity entity = response.getEntity();
			if (null != entity) {
				responseContent = EntityUtils.toString(entity, ContentType.getOrDefault(entity).getCharset());
				EntityUtils.consume(entity);
			}
		} catch (ConnectTimeoutException cte){
		} catch (SocketTimeoutException ste){
		} catch (Exception e) {
		} finally {
			httpClient.getConnectionManager().shutdown();
		}
		return responseContent;
	}
	public static String post(String url, Map<String, String> paramsMap) {
		CloseableHttpClient client = HttpClients.createDefault();
		String responseText = "";
		CloseableHttpResponse response = null;
		try {
			HttpPost method = new HttpPost(url);
			if (paramsMap != null) {
				List<NameValuePair> paramList = new ArrayList<NameValuePair>();
				for (Map.Entry<String, String> param : paramsMap.entrySet()) {
					NameValuePair pair = new BasicNameValuePair(param.getKey(), param.getValue());
					paramList.add(pair);
				}
				method.setEntity(new UrlEncodedFormEntity(paramList, "UTF-8"));
			}
			response = client.execute(method);
			HttpEntity entity = response.getEntity();
			if (entity != null) {
				responseText = EntityUtils.toString(entity);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				response.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return responseText;
	}
}