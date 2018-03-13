package com.fh.common.util.codec;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;

public class MD5Utils {
	private final static char hexDigits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
	public static String encode(byte[] source) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(source);
			byte[] bytes = md.digest();
			return byteToHex(bytes);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static String byteToHex(byte[] bytes){
		char str[] = new char[16 * 2];
		int k = 0;
		for (int i = 0; i < 16; i++) {
			byte byte0 = bytes[i];
			str[k++] = hexDigits[byte0 >>> 4 & 0XF];
			str[k++] = hexDigits[byte0 & 0XF];
		}
		return new String(str);
	}
	public static String byteToHEX(byte bt) {
		char[] Digit = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a',
				'b', 'c', 'd', 'e', 'f' };
		char[] ob = new char[2];
		ob[0] = Digit[(bt >>> 4) & 0X0F];
		ob[1] = Digit[bt & 0X0F];
		return new String(ob);
	}
	public static long b2iu(byte b) {
		return b < 0 ? b & 0x7F + 128 : b;
	}
	public static String encode(String str) {
		return encode(str.getBytes());
	}
	public static String encode(String str, String salt) {
		return encode((str + "{" + salt + "}").getBytes());
	}
	public static String encode(File file) throws Exception {
		return encode(new FileInputStream(file));
	}
	public static String encode(InputStream in) throws Exception {
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			byte[] bt = new byte[1024];
			int ilen = 0;
			while ((ilen = in.read(bt)) >= 0) {
				messageDigest.update(bt, 0, ilen);
			}
			return byteToHex(messageDigest.digest());
		} finally {
			in.close();
		}
	}

}
