package com.summer.designmode.proxy.summerproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyProxy implements InvocationHandler {
    private Object target;


    public Object newInstance(Object object){
        this.target = object;
        Class<?> clazz = target.getClass();
        return SummerProxy2.instance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(this.target,args);
        after();
        return result;
    }
    private void before(){
        System.out.println("before ...");
    }

    private void after(){
        System.out.println("after ...");
    }
}
