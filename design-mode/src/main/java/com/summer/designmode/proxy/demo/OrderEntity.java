package com.summer.designmode.proxy.demo;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class OrderEntity {
    private String id;
    private Date createTime;
}
