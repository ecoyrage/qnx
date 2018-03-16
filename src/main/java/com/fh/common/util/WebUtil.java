package com.fh.common.util;

import com.fh.common.constants.Consts;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.io.SAXReader;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.net.URLEncoder;
import java.util.*;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebUtil {

	private static Logger logger = Logger.getLogger(WebUtil.class);

	/**
	 * 以JSON格式输出
	 * 
	 * @param response
	 */
	public static void responseByJSON(ServletResponse response, String content) {
		response(response, content, "JSON");
	}

	public static void response(ServletResponse response, String content,
                                String type) {
		response.setCharacterEncoding("UTF-8");
		if (type.equals("JSON")) {
			response.setContentType("application/json; charset=utf-8");
		} else if (type.equals("XML")) {
			response.setContentType("text/xml; charset=utf-8");
		} else {
			response.setContentType("text/plain; charset=utf-8");
		}

		PrintWriter out = null;
		try {
			out = response.getWriter();
			out.append(content);
			out.flush();
			// String res = "系统发送的JSON数据："+content;
			// logger.info(res);
		} catch (IOException e) {
			logger.error("系统发送JSON数据失败", e);
			e.printStackTrace();
		} finally {
			if (out != null) {
				out.close();
			}
		}
	}

	/**
	 * 根据对象从request中获取相应的属性值
	 * 
	 * @param request
	 * @param clazz
	 * @return
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 * @throws InvocationTargetException
	 */
	public static <T> T getObjectFromRequest(ServletRequest request,
			Class<T> clazz) throws InstantiationException,
			IllegalAccessException, InvocationTargetException {
		try {
			T bean = clazz.newInstance();
			@SuppressWarnings("rawtypes")
			Enumeration e = request.getParameterNames();
			while (e.hasMoreElements()) {
				String name = (String) e.nextElement();
				String value = request.getParameter(name);
				if (value != null && value.trim().equals("")) {
					value = null;
				}
				BeanUtils.setProperty(bean, name, value);
			}
			return bean;
		} catch (Exception e) {
			new RuntimeException();
		}
		return null;
	}

	/**
	 * 从request中获取参数的map集合
	 * 
	 * @param request
	 * @return
	 */
	public static Map<String, String> request2Map(ServletRequest request) {
		Map<String, String> map = new HashMap<String, String>();
		@SuppressWarnings("rawtypes")
		Enumeration e = request.getParameterNames();
		while (e.hasMoreElements()) {
			String name = (String) e.nextElement();
			String value = request.getParameter(name);
			if (value != null && value.trim().equals("")) {
				value = null;
			}
			map.put(name, value);
		}
		return map;
	}

	/**
	 * 从request中获取xml字符串
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public static String request2Xml(ServletRequest request) throws Exception {
		InputStream inputStream = request.getInputStream();
		// 读取输入流
		SAXReader reader = new SAXReader();
		Document document = reader.read(inputStream);
		// 释放资源
		inputStream.close();
		return document.asXML();
	}

	/**
	 * 获取请求中的文件 针对springMVC框架
	 * 
	 * @param request
	 * @param fileName
	 *            文件名称
	 * @return
	 */
	public static File getRequestFile(HttpServletRequest request,
			String fileName) throws IllegalStateException, IOException {
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		// 获取物理路径
		String path = request.getSession().getServletContext()
				.getRealPath(Consts.FILE_UPLOAD_PATH);
		MultipartFile file = multipartRequest.getFile(fileName);
		if (file != null) {
			String myFileName = file.getOriginalFilename(); // 原文件名
			if (myFileName != null && myFileName.trim() != "") {
				String extName = myFileName.substring(myFileName
						.lastIndexOf("."));// 文件后缀名，带.的
				String curFileName = IDUtil.genUUID() + extName;
				String ymd = DateUtil.toString(new Date(),
						DateUtil.format_ymd_by_);
				path = path + "/" + ymd + "/" + curFileName;
				File localFile = new File(path);
				if (!localFile.getParentFile().exists()) {
					localFile.mkdirs();
				}
				file.transferTo(localFile);
				return localFile;
			}
		}
		return null;
	}

	/**
	 * 获取用户真实IP地址，不使用request.getRemoteAddr();的原因是有可能用户使用了代理软件方式避免真实IP地址,
	 * 
	 * 可是，如果通过了多级反向代理的话，X-Forwarded-For的值并不止一个，而是一串IP值，究竟哪个才是真正的用户端的真实IP呢？
	 * 答案是取X-Forwarded-For中第一个非unknown的有效IP字符串。
	 * 
	 * 如：X-Forwarded-For：192.168.1.110, 192.168.1.120, 192.168.1.130,
	 * 192.168.1.100
	 * 
	 * 用户真实IP为： 192.168.1.110
	 * 
	 * @param request
	 * @return
	 */
	public static String getIpAddress(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_CLIENT_IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_X_FORWARDED_FOR");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}

	/**
	 * 只针对dataTable的获取分页数据请求 获取dataTable的列搜索值 columns[0][search][value]
	 * 
	 * @param request
	 * @param pname
	 * @return
	 */
	public static Map<String, Object> getDataTableColumnSearchValue(
            HttpServletRequest request, String[] pname) {
		Enumeration<String> e = request.getParameterNames();
		Map<String, Object> data = new HashMap<String, Object>();
		while (e.hasMoreElements()) {
			String name = (String) e.nextElement();
			String val = request.getParameter(name);
			if (name.contains("[search][value]") && val != null
					&& !val.trim().equals("")) {
				int id = Integer.parseInt(name.charAt(8) + "");// 获取对应的参数名
				data.put(pname[id], val);
			}
		}
		return data;
	}

	/**
	 * 上传文件保存到本地 针对struts2框架
	 * 
	 * @param uploadFile
	 * @param extName
	 * @return
	 * @throws IOException
	 */
	/*public static String getFileUrl_UploadFileToLocalFile(
            HttpServletRequest request, File uploadFile, String extName)
			throws IOException {
		if (uploadFile == null) {
			return null;
		}
		// 获取物理路径
		String path = request.getSession().getServletContext()
				.getRealPath(Consts.setting.getFileUploadPath());
		String curFileName = IDUtil.genUUID() + extName;
		String ymd = DateUtil.toString(new Date(), DateUtil.format_ymd_by_);
		path = path + "/" + ymd + "/" + curFileName;
		String uri_path = Consts.setting.getFileUploadPath() + "/" + ymd + "/"
				+ curFileName;// 图片URI资源路径
		File localFile = new File(path);
		if (!localFile.getParentFile().exists()) {
			localFile.getParentFile().mkdirs();
		}
		localFile.createNewFile();
		FileUtils.copyFile(uploadFile, localFile);
		String fileUrl = Consts.setting.getImgServer() + uri_path;
		return fileUrl;
	}*/

	/**
	 * 复制目标对象非空属性的值到源对象
	 * 
	 * @param source
	 *            覆盖的对象
	 * @param dest
	 *            复制的对象
	 * @throws Exception
	 */
	public static void Copy(Object source, Object dest) throws Exception {
		// 获取属性
		BeanInfo sourceBean = Introspector.getBeanInfo(source.getClass(),
				Object.class);
		PropertyDescriptor[] sourceProperty = sourceBean
				.getPropertyDescriptors();

		BeanInfo destBean = Introspector.getBeanInfo(dest.getClass(),
				Object.class);
		PropertyDescriptor[] destProperty = destBean.getPropertyDescriptors();
		for (int i = 0; i < sourceProperty.length; i++) {
			for (int j = 0; j < destProperty.length; j++) {
				if (sourceProperty[i].getName().equals(destProperty[j].getName())) {
					// 调用source的setter方法和dest的getter方法，把dest的值复制过去
					Object value = destProperty[j].getReadMethod().invoke(dest);
					if (value != null && !value.equals("")) {
						sourceProperty[i].getWriteMethod().invoke(source, value);
					}
					break;
				}
			}
		}
	}

	/**
	 * 获取上传文件的URL路径 针对springmvc框架
	 *
	 * @param request
	 * @param uploadFileName
	 *            上传文件名
	 * @return 上传文件访问url
	 */
	/*public static String getRequestFile_savePath(HttpServletRequest request,
			String uploadFileName) {
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		MultipartFile file = multipartRequest.getFile(uploadFileName);
		try {
			if (file != null) {
				String myFileName = file.getOriginalFilename(); // 原文件名
				if (myFileName != null && myFileName.trim() != "") {
					// 获取物理路径
					String path = request.getSession().getServletContext()
							.getRealPath(Consts.setting.getFileUploadPath());
					String extName = myFileName.substring(myFileName
							.lastIndexOf("."));// 文件后缀名，带.的
					String curFileName = IDUtil.genUUID() + extName;
					String ymd = DateUtil.toString(new Date(),
							DateUtil.format_ymd_by_);
					path = path + "/" + ymd + "/" + curFileName;
					String uri_path = Consts.setting.getFileUploadPath() + "/"
							+ ymd + "/" + curFileName;// 文件URI资源路径
					File localFile = new File(path);
					if (!localFile.getParentFile().exists()) {
						localFile.mkdirs();
					}
					file.transferTo(localFile);
					String fileUrl = Consts.setting.getImgServer() + uri_path;
					return fileUrl;
				}
			}
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}*/

	/**
	 * 获取多上传文件的URL路径 针对springmvc框架
	 *
	 * @param request
	 * @param uploadFileName
	 *            上传文件名
	 * @return 上传文件访问url
	 */
	public static String[] getRequestFiles_savePath(HttpServletRequest request,
			String uploadFileName) {
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		Iterator<String> iter = multipartRequest.getFileNames();
		List<String> paths = new ArrayList<String>();
		try {
			while (iter.hasNext()) {
				// 取得上传文件
				List<MultipartFile> files = multipartRequest.getFiles(iter.next());
				for (MultipartFile file : files) {
					if (file != null && file.getName().equals(uploadFileName)) {
						String myFileName = file.getOriginalFilename(); // 原文件名
						if (myFileName != null && myFileName.trim() != "") {
							// 获取物理路径
							String path = request
									.getSession()
									.getServletContext()
									.getRealPath(
											Consts.FILE_UPLOAD_PATH);
							String extName = myFileName.substring(myFileName
									.lastIndexOf("."));// 文件后缀名，带.的
							String curFileName = IDUtils.next() + extName;
							String ymd = DateUtil.toString(new Date(),
									DateUtil.format_ymd_by_);
							path = path + "/" + ymd + "/" + curFileName;
							String uri_path = Consts.FILE_UPLOAD_PATH
									+ "/"
									+ ymd
									+ "/"
									+ curFileName;// 文件URI资源路径
							File localFile = new File(path);
							if (!localFile.getParentFile().exists()) {
								localFile.mkdirs();
							}
							file.transferTo(localFile);
							String fileUrl = uri_path;
							paths.add(fileUrl);
						}
					}
				}
			}
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		return paths.toArray(new String[paths.size()]);
	}

	/**
	 * 获取系统设置
	 *
	 * @return 系统设置
	 */
	/*@SuppressWarnings("unchecked")
	public static Setting getSetting() {
		Setting setting = Consts.setting;
		if (setting == null) {
			setting = new Setting();
			try {
				File shopxxXmlFile = new ClassPathResource("/settings.xml")
						.getFile();
				Document document = new SAXReader().read(shopxxXmlFile);
				List<org.dom4j.Element> elements = document
						.selectNodes("/settings/setting");
				for (org.dom4j.Element element : elements) {
					try {
						String name = element.attributeValue("name");
						String value = element.attributeValue("value");
						BeanUtils.setProperty(setting, name, value);
					} catch (IllegalAccessException e) {
						throw new RuntimeException(e.getMessage(), e);
					} catch (InvocationTargetException e) {
						throw new RuntimeException(e.getMessage(), e);
					}
				}
			} catch (IOException e) {
				throw new RuntimeException(e.getMessage(), e);
			} catch (DocumentException e) {
				throw new RuntimeException(e.getMessage(), e);
			}
			Consts.setting = setting;
		}
		return setting;
	}*/

	/**
	 * 设置系统设置
	 *
	 * @param
	 */
	@SuppressWarnings("unchecked")
	/*public static void setSetting(Setting setting) {
		Assert.notNull(setting);
		try {
			File settingXmlFile = new ClassPathResource("/settings.xml")
					.getFile();
			Document document = new SAXReader().read(settingXmlFile);
			List<org.dom4j.Element> elements = document
					.selectNodes("/settings/setting");
			for (org.dom4j.Element element : elements) {
				try {
					String name = element.attributeValue("name");
					String value = BeanUtils.getProperty(setting, name);
					Attribute attribute = element.attribute("value");
					attribute.setValue(value);
				} catch (IllegalAccessException e) {
					throw new RuntimeException(e.getMessage(), e);
				} catch (InvocationTargetException e) {
					throw new RuntimeException(e.getMessage(), e);
				} catch (NoSuchMethodException e) {
					throw new RuntimeException(e.getMessage(), e);
				}
			}
			XMLWriter xmlWriter = null;
			try {
				OutputFormat outputFormat = OutputFormat.createPrettyPrint();
				outputFormat.setEncoding("UTF-8");
				outputFormat.setIndent(true);
				outputFormat.setIndent("	");
				outputFormat.setNewlines(true);
				xmlWriter = new XMLWriter(new FileOutputStream(settingXmlFile),
						outputFormat);
				xmlWriter.write(document);
				xmlWriter.flush();
			} catch (FileNotFoundException e) {
				throw new RuntimeException(e.getMessage(), e);
			} catch (UnsupportedEncodingException e) {
				throw new RuntimeException(e.getMessage(), e);
			} catch (IOException e) {
				throw new RuntimeException(e.getMessage(), e);
			} finally {
				try {
					if (xmlWriter != null) {
						xmlWriter.close();
					}
				} catch (IOException e) {
				}
			}
			Consts.setting = setting;
		} catch (IOException e) {
			throw new RuntimeException(e.getMessage(), e);
		} catch (DocumentException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}*/

	/**
	 * 从网页数据中获取图片地址
	 *
	 * @param htmlStr
	 * @return
	 */
	public static String[] getImgStrFromHtml(String content) {
		String img = "";
		Pattern p_image;
		Matcher m_image;
		String str = "";
		String[] images = null;
		String regEx_img = "(<img.*src\\s*=\\s*(.*?)[^>]*?>)";
		p_image = Pattern.compile(regEx_img, Pattern.CASE_INSENSITIVE);
		m_image = p_image.matcher(content);
		while (m_image.find()) {
			img = m_image.group();
			Matcher m = Pattern.compile("src\\s*=\\s*\"?(.*?)(\"|>|\\s+)")
					.matcher(img);
			while (m.find()) {
				String tempSelected = m.group(1);
				if ("".equals(str)) {
					str = tempSelected;
				} else {
					String temp = tempSelected;
					str = str + "," + temp;
				}
			}
		}
		if (!"".equals(str)) {
			images = str.split(",");
		}
		return images;
	}

	/**
	 * 网页数据转化成纯文本
	 *
	 * @param inputString
	 * @return
	 */
	public static String Html2Text(String inputString) {
		String htmlStr = inputString; // 含html标签的字符串
		String textStr = "";
		Pattern p_script;
		Matcher m_script;
		Pattern p_style;
		Matcher m_style;
		Pattern p_html;
		Matcher m_html;
		try {
			String regEx_script = "<[\\s]*?script[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?script[\\s]*?>"; // 定义script的正则表达式{或<script[^>]*?>[\\s\\S]*?<\\/script>
																										// }
			String regEx_style = "<[\\s]*?style[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?style[\\s]*?>"; // 定义style的正则表达式{或<style[^>]*?>[\\s\\S]*?<\\/style>
																									// }
			String regEx_html = "<[^>]+>"; // 定义HTML标签的正则表达式

			p_script = Pattern.compile(regEx_script, Pattern.CASE_INSENSITIVE);
			m_script = p_script.matcher(htmlStr);
			htmlStr = m_script.replaceAll(""); // 过滤script标签

			p_style = Pattern.compile(regEx_style, Pattern.CASE_INSENSITIVE);
			m_style = p_style.matcher(htmlStr);
			htmlStr = m_style.replaceAll(""); // 过滤style标签

			p_html = Pattern.compile(regEx_html, Pattern.CASE_INSENSITIVE);
			m_html = p_html.matcher(htmlStr);
			htmlStr = m_html.replaceAll(""); // 过滤html标签

			textStr = htmlStr;
		} catch (Exception e) {
			logger.debug("Html2Text: " + e.getMessage());
		}
		return textStr;// 返回文本字符串
	}

	/**
	 * 是否是安全请求
	 * 
	 * @param request
	 * @param second
	 *            安全时间（秒）
	 * @return
	 */
	public static boolean isSafeHttpRequest(HttpServletRequest request,
			int second) {
		HttpSession session = request.getSession();
		String ip = request.getRemoteHost();
		String _ip = session.getAttribute("_ip") == null ? null
				: (String) session.getAttribute("_ip");
		long _lastReqTime = session.getAttribute("_lastReqTime") == null ? 0
				: (long) session.getAttribute("_lastReqTime");
		if (_ip == null || _lastReqTime == 0) {
			session.setAttribute("_ip", ip);
			session.setAttribute("_lastReqTime", new Date().getTime());
			return true;
		} else {
			if ((new Date().getTime() - _lastReqTime) > (second * 1000)) {
				session.setAttribute("_lastReqTime", new Date().getTime());
				return true;
			} else {
				return false;
			}
		}
	}

	/**
	 * 获取完整URL地址
	 * 
	 * @param request
	 * @return
	 */
	public static String getFullUrl(HttpServletRequest request) {
		return request.getRequestURL().toString()
				+ (request.getQueryString() == null ? "" : ("?" + request
						.getQueryString()));
	}

	/**
	 * 验证是否是手机
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isMobile(String str) {
		Pattern p = null;
		Matcher m = null;
		boolean b = false;
		p = Pattern
				.compile("^(13[0-9]|14(5|7)|15(0|1|2|3|5|6|7|8|9)|17[0-9]|18[0-9])\\d{8}$"); // 验证手机号
		m = p.matcher(str);
		b = m.matches();
		return b;
	}

	/**
	 * 随机数
	 * 
	 * @param r
	 * @return
	 */
	public static int random(int r) {
		return (int) (Math.random() * r + 1);
	}

	/**
	 * 数组转字符
	 * 
	 * @param
	 * @param
	 * @return
	 */
	public static String arrayToString(String[] ss, String s) {
		if (s == null) {
			s = "";
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; ss != null && i < ss.length; i++) {
			sb.append(ss[i].trim()).append(s);
		}
		if (ss != null && ss.length > 0) {
			sb.deleteCharAt(sb.length() - 1);
		}
		return sb.toString();
	}

	/**
	 * 获取域名
	 * 
	 * @param request
	 * @return
	 */
	public static String getDomain(HttpServletRequest request) {
		StringBuffer url = request.getRequestURL();
		return url
				.delete(url.length() - request.getRequestURI().length(),
						url.length()).append("/").toString();
	}

	/**
	 * @param biz_content
	 * @param
	 */
	public static String map2String(Map<String, String> biz_content, String s) {
		ArrayList<String> list = new ArrayList<String>();
		for (Entry<String, String> obj : biz_content.entrySet()) {
			list.add(obj.getKey() + "=" + obj.getValue() + "&");
		}
		int size = list.size();
		String[] arrayToSort = list.toArray(new String[size]);
		Arrays.sort(arrayToSort, String.CASE_INSENSITIVE_ORDER);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			sb.append(arrayToSort[i]);
		}
		if (size > 0) {
			sb.deleteCharAt(sb.length() - 1);
		}
		return sb.toString();
	}

	/**
	 * 获取当前会员ID
	 * 
	 * @param request
	 * @return
	 */
	/*public static Long getCurrentCusId(HttpServletRequest request) {
		String cusIdStr = CookieUtil.getCookieValue(request, "cusId");
		Long cusId = null;
		if (!StringUtils.isEmpty(cusIdStr)) {
			cusId = Long.parseLong(cusIdStr);
		}
		return cusId;
	}*/

	/**
	 * 是否是邮箱
	 * 
	 * @param email
	 * @return
	 */
	public static boolean isEmail(String email) {
		String check = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
		Pattern regex = Pattern.compile(check);
		Matcher matcher = regex.matcher("dffdfdf@qq.com");
		boolean isMatched = matcher.matches();
		return isMatched;
	}

	/*
	 * @auther:yxs
	 */
	public static void download(String path, HttpServletRequest request, HttpServletResponse response) {
		try {
			// path是指欲下载的文件的路径。
			File file = new File(path);
			// 取得文件名。
			String filename = file.getName();
			// 以流的形式下载文件。
			InputStream fis = new BufferedInputStream(new FileInputStream(path));
			byte[] buffer = new byte[fis.available()];
			fis.read(buffer);
			fis.close();
			// 清空response
			//response.reset();
			// 设置response的Header
			//response.setHeader("Content-Disposition", "attachment; filename=" + java.net.URLEncoder.encode(filename, "UTF-8"));  
			String agent = request.getHeader("User-Agent");
			// 判断是哪种浏览器发送的请求,对文件名进行响应的编码设置
            if (agent.toLowerCase().indexOf("firefox") > 0) {
            	filename = new String(filename.getBytes("UTF-8"), "ISO8859-1");
            }
            //IE
            else if (agent.toUpperCase().indexOf("MSIE") > 0){
            	filename = URLEncoder.encode(filename, "UTF-8");
            }else{
            	filename = URLEncoder.encode(filename, "UTF-8");
            }
             
            response.setHeader("Content-Disposition", "attachment;filename=\""+filename+"\"");
			//response.addHeader("Content-Length", "" + file.length());
			OutputStream toClient = new BufferedOutputStream(
					response.getOutputStream());
			String name = file.getName();
			String str=name.substring(name.lastIndexOf(".")+1); 
			response.setContentType("application/"+str+";charset=utf-8");
			toClient.write(buffer);
			toClient.flush();
			toClient.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
