package com.summer.designmode.proxy.summerproxy;

import java.lang.reflect.Method;

public interface SummerInvocationHandler{
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
