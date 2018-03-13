package com.fh.common.util;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;


public class BeanUtils extends org.apache.commons.beanutils.BeanUtils {
	public static <T> T toBean(T bean, Map<String, ? extends Object> map) {
		if (map != null && bean != null) {
			try {
				populate(bean, map);
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		return bean;
	}
	public static <T> T toBean(Class<T> beanClass, Map<String, ? extends Object> map) {
		T bean = null;
		try {
			bean = beanClass.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return toBean(bean, map);
	}
	
	public static <T> Map<String, String> parse(T bean) {
		if(bean != null){
			try {
				return describe(bean);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

}
