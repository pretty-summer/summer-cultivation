package com.summer.designmode.proxy.summerproxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class SummerProxy2 {
    /**
     * Constructs a new {@code Proxy} instance from a subclass
     * (typically, a dynamic proxy class) with the specified value
     * for its invocation handler.
     *
     * @param h the invocation handler for this proxy instance
     * @throws NullPointerException if the given invocation handler, {@code h},
     *                              is {@code null}.
     */
    public static Object instance(ClassLoader loader,
                                Class<?>[] interfaces,
                                InvocationHandler h){

        final Class<?>[] intfs = interfaces.clone();
        Class<?> proxyClass= Proxy.getProxyClass(loader,intfs);
        try {
            Constructor<?> con = proxyClass.getConstructor(InvocationHandler.class);
            return con.newInstance(h);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }
}
