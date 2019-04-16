package com.summer.designmode.proxy.staticproxy.dbproxy;

import com.summer.designmode.proxy.demo.OrderEntity;
import com.summer.designmode.proxy.demo.OrderService;

import java.util.Date;

public class DataSourceProxyTest {
    public static void main(String[] args) {
        DynamicDataSourceStaticProxy proxy = new DynamicDataSourceStaticProxy(new OrderService());
        proxy.createOrder(OrderEntity.builder().createTime(new Date()).build());
    }
}
