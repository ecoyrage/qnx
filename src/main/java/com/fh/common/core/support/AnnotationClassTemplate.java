package com.fh.common.core.support;

import java.lang.annotation.Annotation;

public abstract class AnnotationClassTemplate extends ClassTemplate {
    protected final Class<? extends Annotation> annotationClass;
    protected AnnotationClassTemplate(String packageName, Class<? extends Annotation> annotationClass) {
        super(packageName);
        this.annotationClass = annotationClass;
    }
}
