package com.fh.common.util.codec;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;

public class AES {
	private String key = "67AEA99D20E8004E5A7A759CD7EF36E6";
	private byte[] password = key.getBytes();
	private final static String AES = "AES";
	private final static String ALGORITHM = "SHA1PRNG";
	public AES() {
	}
	
	public AES(String key) {
		this.key = key;
		this.password = key.getBytes();
	}
	public byte[] encode(byte[] byteContent) throws Exception
	{
		return encode(byteContent, password);
	}
	public static byte[] encode(byte[] byteContent, byte[] password) throws Exception
	{
		KeyGenerator kgen = KeyGenerator.getInstance(AES);
		SecureRandom secureRandom = SecureRandom.getInstance(ALGORITHM);
		secureRandom.setSeed(password);
		kgen.init(128, secureRandom);
		SecretKey secretKey = kgen.generateKey();
		byte[] enCodeFormat = secretKey.getEncoded();
		SecretKeySpec key = new SecretKeySpec(enCodeFormat, AES);
		Cipher cipher = Cipher.getInstance(AES);
		cipher.init(Cipher.ENCRYPT_MODE, key);
		byte[] result = cipher.doFinal(byteContent);
		return result;
	}
	public byte[] decode(byte[] content) throws Exception
	{
		return decode(content, password);
	}
	public static byte[] decode(byte[] content, byte[] password) throws Exception
	{
		KeyGenerator kgen = KeyGenerator.getInstance(AES);
		SecureRandom secureRandom = SecureRandom.getInstance(ALGORITHM);
		secureRandom.setSeed(password);
		kgen.init(128, secureRandom);
		SecretKey secretKey = kgen.generateKey();
		byte[] enCodeFormat = secretKey.getEncoded();
		SecretKeySpec key = new SecretKeySpec(enCodeFormat, AES);
		Cipher cipher = Cipher.getInstance(AES);
		cipher.init(Cipher.DECRYPT_MODE, key);
		byte[] result = cipher.doFinal(content);
		return result;
		
	}
	public void setKey(String key) {
		this.key = key;
	}

}