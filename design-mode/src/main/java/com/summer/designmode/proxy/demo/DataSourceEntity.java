package com.summer.designmode.proxy.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataSourceEntity {
    private static final String DEFAULT =null;
    private static final ThreadLocal<String> local = new ThreadLocal<String>();

    private static final SimpleDateFormat formate = new SimpleDateFormat("yyyy");

    private DataSourceEntity() {}

    public static String getDateSource(){
        return local.get();
    }
    public static void set(String year){
        System.out.println("切换数据源:"+year);
        local.set(year);
    }

    public static void set(Date date){
        String year = formate.format(date);
        System.out.println("切换数据源:"+year);
        local.set(year);
    }

    public static void restore(){
        System.out.println("重置数据源");
        local.set(DEFAULT);
    }
}
