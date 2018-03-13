package com.fh.common.constants;

import com.fh.common.util.PropertiesLoader;
import com.fh.common.util.StringUtils;
import com.google.common.collect.Maps;
import org.springframework.core.io.DefaultResourceLoader;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class Global {
	private static Global global = new Global();
	private static Map<String, String> map = Maps.newHashMap();
	private static PropertiesLoader loader = new PropertiesLoader("config/global.properties");
	public static final String SHOW = "1";
	public static final String HIDE = "0";
	public static final String YES = "1";
	public static final String NO = "0";
	public static final String TRUE = "true";
	public static final String FALSE = "false";
	public static final String USERFILES_BASE_URL = "/userfiles/";
	public static Global getInstance() {
		return global;
	}
	public static String getConfig(String key) {
		String value = map.get(key);
		if (value == null){
			value = loader.getProperty(key);
			map.put(key, value != null ? value : StringUtils.EMPTY);
		}
		return value;
	}
	public static String getConfig(String key, String defaultValue) {
		String value = getConfig(key);
		return StringUtils.isBlank(value) ? defaultValue : value;
	}
	public static String getAdminPath() {
		return getConfig("adminPath");
	}
	public static String getApiPath() {
		return getConfig("apiPath");
	}
	public static String getFrontPath() {
		return getConfig("frontPath");
	}
	public static String getUrlSuffix() {
		return getConfig("urlSuffix");
	}
	public static String getDomain() {
		return getConfig("domain");
	}
	public static Boolean isDevMode() {
		String dm = getConfig("devMode");
		return "true".equals(dm) || "1".equals(dm);
	}
	public static Object getConst(String field) {
		try {
			return Global.class.getField(field).get(null);
		} catch (Exception e) {
		}
		return null;
	}
    public static String getProjectPath(){
		String projectPath = Global.getConfig("projectPath");
		if (StringUtils.isNotBlank(projectPath)){
			return projectPath;
		}
		try {
			File file = new DefaultResourceLoader().getResource("").getFile();
			if (file != null){
				while(true){
					File f = new File(file.getPath() + File.separator + "src" + File.separator + "main");
					if (f == null || f.exists()){
						break;
					}
					if (file.getParentFile() != null){
						file = file.getParentFile();
					}else{
						break;
					}
				}
				projectPath = file.toString();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return projectPath;
    }
    
}
