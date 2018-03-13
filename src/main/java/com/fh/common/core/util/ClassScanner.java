package com.fh.common.core.util;

import com.fh.common.core.support.AnnotationClassTemplate;
import com.fh.common.core.support.ClassTemplate;
import com.fh.common.core.support.SupperClassTemplate;

import java.lang.annotation.Annotation;
import java.util.List;

public class ClassScanner {
    public static List<Class<?>> getClassList(String basePackage) {
        return new ClassTemplate(basePackage) {
            @Override
            public boolean checkAddClass(Class<?> cls) {
                String className = cls.getName();
                String pkgName = className.substring(0, className.lastIndexOf("."));
                return pkgName.startsWith(packageName);
            }
        }.getClassList();
    }
    public static List<Class<?>> getClassListByAnnotation(String basePackage, Class<? extends Annotation> annotationClass) {
        return new AnnotationClassTemplate(basePackage, annotationClass) {
            @Override
            public boolean checkAddClass(Class<?> cls) {
                return cls.isAnnotationPresent(annotationClass);
            }
        }.getClassList();
    }

    /**
     * 获取指定包名中指定父类或接口的相关类
     */
    public static List<Class<?>> getClassListBySuper(String basePackage, Class<?> superClass) {
        return new SupperClassTemplate(basePackage, superClass) {
            @Override
            public boolean checkAddClass(Class<?> cls) {
                return superClass.isAssignableFrom(cls) && !superClass.equals(cls);
            }
        }.getClassList();
    }
    
}
