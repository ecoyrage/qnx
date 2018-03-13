package com.fh.common.core;

import com.fh.common.constants.Global;
import com.fh.common.core.annotation.Action;
import com.fh.common.core.annotation.ActionMapping;
import com.fh.common.core.bean.Handler;
import com.fh.common.core.bean.ResultVO;
import com.fh.common.core.util.ClassScanner;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HandlerHelper {
	private static final Map<String, Handler> handlerMap = new HashMap<String, Handler>();
	private static List<Class<?>> actionClassList = ClassScanner.getClassListByAnnotation(Global.getConfig("basepackage"), Action.class);
	public static void init(){
		if(actionClassList.size()>0){
			try {
				for (Class<?> actionClass : actionClassList) {
					try {
						SpringContextHolder.getBean(actionClass);
					} catch (Exception e) {
					}
					Method[] methods = actionClass.getDeclaredMethods();
					for (Method actionMethod : methods) {
						ActionMapping actionMapping = actionMethod.getAnnotation(ActionMapping.class);
						if(actionMapping != null){
							Class<?>[] paramTypes = actionMethod.getParameterTypes();
							
							if(paramTypes!=null && paramTypes.length > 0){
								for (Class<?> clazz : paramTypes) {
								}
							}
							if (actionMethod.getReturnType() == ResultVO.class) {
								Handler handler = new Handler();
								handler.setActionClass(actionClass);
								handler.setActionMethod(actionMethod);
								handler.setActionMapping(actionMapping);
								String[] methodNames = actionMapping.value();
								for (String methodName : methodNames) {
									handlerMap.put(methodName, handler);
								}
							}else{
								throw new RuntimeException("@ReqMapping注解方法返回值类型限制：ResultVO");
							}
						}
					}
					
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(0);
			}
		}
	}
	public static Map<String, Handler> getHandlerMap() {
		return handlerMap;
	}
	public static Handler getHandler(String methodName) {
		return handlerMap.get(methodName);
	}
	
}
