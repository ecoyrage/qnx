package com.fh.common.util.codec;

import org.apache.commons.codec.binary.Base64;

public class AESUtils {
	
	private static String key = "dd886a0c4af15ab0ca47bab400e46715";
	private static AES aes = new AES(key);
	private static Base64 BASE64 = new Base64(true);
	private static String charset = "UTF-8";
	private final static char hexDigits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
	private final static String hexStrs = "0123456789abcdef";
	private static String byteToHex(byte[] bytes){
		char str[] = new char[bytes.length * 2];
		int k = 0;
		for (int i = 0; i < bytes.length; i++) {
			byte byte0 = bytes[i];
			str[k++] = hexDigits[byte0 >>> 4 & 0XF];
			str[k++] = hexDigits[byte0 & 0XF];
		}
		return new String(str);
	}
	@Deprecated
	private static String byteToHex2(byte[] bytes){
		StringBuilder stringBuilder = new StringBuilder("");
		for (int i = 0; i < bytes.length; i++) {
			int v = bytes[i] & 0xFF;
			String hv = Integer.toHexString(v);
			if (hv.length() < 2) {
				stringBuilder.append(0);
			}
			stringBuilder.append(hv);
		}
		return stringBuilder.toString();
	}
	private static byte[] hexToByte(String hexString) {
		if (hexString == null || hexString.equals("")) {
			return null;
		}
		int length = hexString.length() / 2;
		char[] hexChars = hexString.toCharArray();
		byte[] d = new byte[length];
		for (int i = 0; i < length; i++) {
			int pos = i * 2;
			d[i] = (byte) (charToByte(hexChars[pos]) << 4 | charToByte(hexChars[pos + 1]));
		}
		return d;
	}
	private static byte charToByte(char c) {
		return (byte) hexStrs.indexOf(c);
	}
	public static String encryptWithHex(String data) {
		try {
			return byteToHex(aes.encode(data.getBytes(charset)));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public static String decryptWithHex(String data) {
		try {
			return new String(aes.decode(hexToByte(data)), charset);
		} catch (Exception e) {
			//e.printStackTrace();
		}
		return null;
	}
	public static String encryptWithBase64(String str) {
		try {
			return new String(BASE64.encodeBase64URLSafe(aes.encode(str.getBytes(charset))), charset);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public static String decryptWithBase64(String str) {
		try {
			return new String(aes.decode(BASE64.decode(str)), charset);
		} catch (Exception e) {
		}
		return null;
	}
	
	
	public static void main(String[] args) throws Exception {
	}
	
}
