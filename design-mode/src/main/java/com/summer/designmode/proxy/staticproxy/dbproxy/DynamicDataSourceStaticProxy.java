package com.summer.designmode.proxy.staticproxy.dbproxy;


import com.summer.designmode.proxy.demo.DataSourceEntity;
import com.summer.designmode.proxy.demo.IOrderService;
import com.summer.designmode.proxy.demo.OrderEntity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DynamicDataSourceStaticProxy implements IOrderService {
    private IOrderService iOrderService;
    private SimpleDateFormat format = new SimpleDateFormat("yyyy");

    public DynamicDataSourceStaticProxy(IOrderService iOrderService) {
        this.iOrderService = iOrderService;
    }

    public int createOrder(OrderEntity orderEntity) {
        before();
        Date createTime = orderEntity.getCreateTime();
        DataSourceEntity.set(format.format(createTime));

        iOrderService.createOrder(orderEntity);

        DataSourceEntity.restore();

        after();
        return 0;
    }

    private void before(){
        System.out.println("before ...");
    }

    private void after(){
        System.out.println("after ...");
    }
}
