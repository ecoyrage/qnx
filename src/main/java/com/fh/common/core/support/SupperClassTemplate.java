package com.fh.common.core.support;

public abstract class SupperClassTemplate extends ClassTemplate {
    protected final Class<?> superClass;
    protected SupperClassTemplate(String packageName, Class<?> superClass) {
        super(packageName);
        this.superClass = superClass;
    }
}
