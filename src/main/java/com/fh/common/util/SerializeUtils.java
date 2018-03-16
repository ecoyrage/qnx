package com.fh.common.util;

import com.fh.sys.model.Admin;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



public class SerializeUtils {  
	/**
	 * 序列化
	 * 
	 * @param object
	 * @return
	 */
	public static byte[] serialize(Object object) {
		ByteArrayOutputStream baos = null;
		ObjectOutputStream oos = null;
		try {
			// 序列化
			baos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(baos);
			oos.writeObject(object);
			byte[] bytes = baos.toByteArray();
			return bytes;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 反序列化
	 * 
	 * @param bytes
	 * @return
	 */
	public static Object unserialize(byte[] bytes) {
		ByteArrayInputStream bais = null;
		try {
			// 反序列化
			bais = new ByteArrayInputStream(bytes);
			ObjectInputStream ois = new ObjectInputStream(bais);
			return ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 深度赋值
	 * @param object （Serializable object）
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <E> E deepClone(E object) {
		//public static <E> E deepClone(Serializable object) {
		try {
			if(object != null && object instanceof Serializable){
				// 序列化
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(baos);
				oos.writeObject(object);
				// 反序列化
				ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
				ObjectInputStream ois = new ObjectInputStream(bais);
				return (E) ois.readObject();
			}else{
				System.out.println("SerializeUtil.deepClone 未实现Serializable接口错误: " + object);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/*public static void main(String[] args) {
		Admin admin = new Admin();
		admin.setName("111");
		Admin admin2 = deepClone(admin);
		System.out.println(admin2.getName());
		admin2.setName("2222");
		System.out.println(admin.getName());
		System.out.println(admin2.getName());
	}*/
	
}
