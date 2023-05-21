package com.sipc.ep2_AnnotationInJava.dynamicProxies;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AnimalHandler implements InvocationHandler {
    private Object bean;
    public AnimalHandler(Object object){
        this.bean = object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before invoke "  + method.getName());
        method.invoke(bean, args);
        System.out.println("After invoke " + method.getName());
        return null;
    }

}
