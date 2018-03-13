package com.fh.common.util.codec;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class AESKeyUtil {
	public static void main(String[] args) {  
	    getKey();
	    getKeyByPass();
	}  
	public static void getKey(){
	    try {
	        KeyGenerator kg = KeyGenerator.getInstance("AES");
	        kg.init(128);
	        SecretKey sk = kg.generateKey();
	        byte[] b = sk.getEncoded();
	        String s = byteToHexString(b);
	        System.out.println(s);
	        System.out.println("十六进制密钥长度为"+s.length());
	        System.out.println("二进制密钥的长度为"+s.length()*4);
	    } catch (NoSuchAlgorithmException e) {
	        e.printStackTrace();
	        System.out.println("没有此算法。");
	    }
	}
	  
	public static void getKeyByPass(){
	    String password="testkey";
	    try {
	        KeyGenerator kg = KeyGenerator.getInstance("AES");
	        kg.init(128, new SecureRandom(password.getBytes()));
	        SecretKey sk = kg.generateKey();
	        byte[] b = sk.getEncoded();
	        String s = byteToHexString(b);
	        System.out.println(s);
	        System.out.println("十六进制密钥长度为"+s.length());
	        System.out.println("二进制密钥的长度为"+s.length()*4);
	    } catch (NoSuchAlgorithmException e) {
	        e.printStackTrace();
	        System.out.println("没有此算法。");
	    }
	}   
	public static String byteToHexString(byte[] bytes){
	    StringBuffer sb = new StringBuffer();   
	    for (int i = 0; i < bytes.length; i++) {   
	         String strHex=Integer.toHexString(bytes[i]);   
	         if(strHex.length() > 3){   
	                sb.append(strHex.substring(6));   
	         } else {
	              if(strHex.length() < 2){
	                 sb.append("0" + strHex);
	              } else {
	                 sb.append(strHex);   
	              }   
	         }
	    }
	   return  sb.toString();   
	}
}
