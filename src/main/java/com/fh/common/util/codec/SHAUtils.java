package com.fh.common.util.codec;
public class SHAUtils {
	private final static char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
	public static String encode512(byte[] source) {
		try {
			java.security.MessageDigest md = java.security.MessageDigest.getInstance("SHA-512");
			md.update(source);
			byte[] tmp = md.digest();
			char[] str = new char[64 * 2]; // 每个字节用 16 进制表示的话，使用两个字符，
			int k = 0; // 表示转换结果中对应的字符位置
			for (int i = 0; i < 64; i++)
			{ // 从第一个字节开始，对 MD5 的每一个字节
				byte byte0 = tmp[i]; // 取第 i 个字节
				str[k++] = hexDigits[byte0 >>> 4 & 0xf]; // 取字节中高 4 位的数字转换, 
				str[k++] = hexDigits[byte0 & 0xf]; // 取字节中低 4 位的数字转换
			}
			return new String(str); // 换后的结果转换为字符串
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * @param str
	 * @return
	 */
	public static String encode512(String str) {
		return encode512(str.getBytes());
	}
	
	
	public static String encode256(byte[] source) {
		try {
			java.security.MessageDigest md = java.security.MessageDigest.getInstance("SHA-256");
			md.update(source);
			byte[] tmp = md.digest();
			char[] str = new char[32 * 2];
			int k = 0;
			for (int i = 0; i < 32; i++)
			{
				byte byte0 = tmp[i];
				str[k++] = hexDigits[byte0 >>> 4 & 0xf];
				str[k++] = hexDigits[byte0 & 0xf];
			}
			return new String(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static String encode256(String str) {
		return encode256(str.getBytes());
	}

}
