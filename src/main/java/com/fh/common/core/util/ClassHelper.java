package com.fh.common.core.util;

import java.lang.annotation.Annotation;
import java.util.List;

public class ClassHelper {
    public static List<Class<?>> getClassList(String packageName) {
        return ClassScanner.getClassList(packageName);
    }
    public static List<Class<?>> getClassListBySuper(String packageName, Class<?> superClass) {
        return ClassScanner.getClassListBySuper(packageName, superClass);
    }
    public static List<Class<?>> getClassListByAnnotation(String packageName, Class<? extends Annotation> annotationClass) {
        return ClassScanner.getClassListByAnnotation(packageName, annotationClass);
    }
    
    
}
