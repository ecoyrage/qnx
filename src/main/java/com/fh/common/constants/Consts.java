package com.fh.common.constants;

import java.math.BigDecimal;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Consts {
	public static ExecutorService pools = Executors.newCachedThreadPool();
	public static final boolean checkSign = false;
	public static final int apiDefaultPagesize = 20;
	public static final String serviceRefreshToken = "cm.user.refreshtoken";
	public static final int apiSmsCodeTimeout = 60*5;
	public  static final BigDecimal ORDER_AMOUNT = new BigDecimal(Double.valueOf(20));
	public static final String FILE_UPLOAD_PATH = "/resource/upload/images";
	public static final String REG_TEMPLATE_CODE = "【去哪儿学】您注册用户的短信验证码为：CODE，请于5分钟内完成注册。";
	public static final String FIND_PSW_TEMPLATE_CODE = "【去哪儿学】您找回密码的短信验证码为：CODE，请于5分钟内完成修改。";
	public static final String SMS_SINGLE_REQUESTSERVER_URL = "http://smssh1.253.com/msg/send/json";
}
