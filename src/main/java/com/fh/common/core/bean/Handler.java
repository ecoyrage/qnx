package com.fh.common.core.bean;

import com.fh.common.core.annotation.ActionMapping;

import java.lang.reflect.Method;

public class Handler {
	private Class<?> actionClass;
	private Method actionMethod;
	private ActionMapping actionMapping;
	public Class<?> getActionClass() {
		return actionClass;
	}
	public void setActionClass(Class<?> actionClass) {
		this.actionClass = actionClass;
	}
	public Method getActionMethod() {
		return actionMethod;
	}
	public void setActionMethod(Method actionMethod) {
		this.actionMethod = actionMethod;
	}
	public ActionMapping getActionMapping() {
		return actionMapping;
	}
	public void setActionMapping(ActionMapping actionMapping) {
		this.actionMapping = actionMapping;
	}
	
}
