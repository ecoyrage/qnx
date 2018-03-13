package com.fh.common.constants;

public class SysConstants {
	public static final String PAGE_UNCHECK = Global.getConfig("page.uncheck");
	public static final String PAGE_OUTPUT = Global.getConfig("page.output");
	public static final String PAGE_LIMIT_PAGESIZE = Global.getConfig("page.limit.pageSize");
	public static final String FILE_MODE = Global.getConfig("file.mode","local");
	public static final String FILE_PATH = Global.getConfig("file.path");
	public static final String FILE_MAXSIZE = Global.getConfig("file.maxsize");
	public static final String PAY_PATH = Global.getConfig("pay.path","pay/");
	public static final String SENDSMS_ACCOUNT = Global.getConfig("sms.account","");
	public static final String SENDSMS_PWD = Global.getConfig("sms.pwd","");
	public static final String OSS_KEY = Global.getConfig("oss.key");
	public static final String OSS_SECRET = Global.getConfig("oss.secret");
	public static final String OSS_BUCKET = Global.getConfig("oss.bucket");
	public static final String OSS_ENDPOINT = Global.getConfig("oss.endpoint");
	public static final String OSS_IMG_ENDPOINT = Global.getConfig("oss.img.endpoint");
	public static final Boolean GRAPHICS_MAGICK_ENABLE = Boolean.valueOf("true".equals(Global.getConfig("graphics.magick.enable", "false")));
	public static final String GRAPHICS_MAGICK_PATH = Global.getConfig("graphics.magick.path");
	public static final String SIGN = "sign";
	public static final String TIMESTAMP = "timestamp";
	public static final String NONCE = "nonce";
	public static final String WEB_APPID = "WEB";
	public static final String FTP_ADDRESS = Global.getConfig("ftp.address");
	public static final String FTP_PORT = Global.getConfig("ftp.port", "21");
	public static final String FTP_USERNAME = Global.getConfig("ftp.username");
	public static final String FTP_PASSWORD = Global.getConfig("ftp.password");
	public static final String FTP_PATH = Global.getConfig("ftp.path");
}
