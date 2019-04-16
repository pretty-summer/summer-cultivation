package com.summer.designmode.proxy.summerproxy;

import com.summer.designmode.proxy.demo.IOrderService;
import com.summer.designmode.proxy.demo.OrderEntity;
import com.summer.designmode.proxy.demo.OrderService;

import java.util.Date;

/**
 * JDK Proxy 采用字节重组，重新生的对象来替代原始的对象以达到动态代理 的目的
 *
 * JDK Proxy 生成对象的步骤如下：
 * 1、拿到被代理对象的引用，并且获取到它的所有的接口，反射获取。
 * 2、JDK Proxy 类重新生成一个新的类、同时新的类要实现被代理类所有实现的所有的接 口。
 * 3、动态生成 Java 代码，把新加的业务逻辑方法由一定的逻辑代码去调用（在代码中体 现）。
 * 4、编译新生成的 Java 代码.class。
 * 5、再重新加载到 JVM 中运行。
 */
public class SummerProxyTest {
    public static void main(String[] args) {
        IOrderService iOrderService = (IOrderService) new MyProxy().newInstance(new OrderService());
        iOrderService.createOrder(OrderEntity.builder().createTime(new Date()).build());
    }
}
