package com.summer.designmode.proxy.demo;

public class OrderService implements IOrderService {
    public int createOrder(OrderEntity orderEntity) {
        System.out.println("创建订单");
        return 0;
    }
}
