package com.summer.datastructure.stack;

import java.util.ArrayList;
import java.util.List;

public class StackClient {
    public static void main(String[] args) {
//        inversion();
//        a();
//        a1();
        a2();
    }

    /**
     * 数据倒置
     */
    private static void inversion(){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        List<String> inversionList = new ArrayList<>();
        SummerStack summerStack = new SummerSimpleStack();
        for(String s:list){
            summerStack.push(s);
        }
        int size = summerStack.size();
        for(int i= 0 ;i<size;i++){
            inversionList.add((String) summerStack.pop());
        }
        System.out.println(inversionList);
    }

    /**
     * 方法栈1   ----start----
     *
     * 对于属于基本类型（比如int或float）的变量x，x的当前值就是其算数值。
     * 假设方法N调用方法M 时，如果x作为参数传递给M，那么x的当前值就会被复制到M所对应帧中的某个局部变量。
     * 需要指出的是，此后即使方法M修改了该局部变量的数值，x在N中的数值也决不会受到影响
     */
    private static void a(){
        int i = 1;
        b(i);
        System.out.println("a-> i:"+i);
    }

    private static void b(int i){
        i = 2;
        System.out.println("b-> i:"+i);

    }

    /**
     * 方法栈1   ----end----\
     */

    /**
     * 方法栈2   ----start----
     *倘若 x 是指向某对象 o 的一个引用，那么 x 的当前值就是对象 o 的内存地址。
     * 因此，如 果将 x 作为参数传递给方法 N，实际上传递的是对象 o 的内存地址。
     * 这个地址被复制给 N 的某个局 部变量 y 之后，y 也将和 x 一样地指向对象 o
     */
    private static void a1(){
        Summer summer = Summer.create("summer");
        b1(summer);
        System.out.println("a-> summer:"+summer);
    }

    private static void b1(Summer summer ){
        summer.setName("summer_b");
        System.out.println("b-> summer:"+summer);
    }

    /**
     * 方法栈2   ----end----\
     */


    /**
     * 方法栈2   ----start----
     *倘若 x 是指向某对象 o 的一个引用，那么 x 的当前值就是对象 o 的内存地址。
     * 因此，如 果将 x 作为参数传递给方法 N，实际上传递的是对象 o 的内存地址。
     * 这个地址被复制给 N 的某个局 部变量 y 之后，y 也将和 x 一样地指向对象 o
     */
    private static void a2(){
        List<String>list = new ArrayList<>();
        list.add("a2");

        List<Summer>list2 = new ArrayList<>();
        list2.add(Summer.create("summer_a"));
        b2(list,list2);
        System.out.println("a-> list:"+list);
        System.out.println("a-> listSummer:"+list2);
    }

    private static void b2(List<String> list,List<Summer>summers ){
        list.remove(0);
        summers.get(0).setName("summer_b");
        summers.add(Summer.create("summer_c"));
        System.out.println("b-> list:"+list);
        System.out.println("b-> listSummer:"+summers);
    }

    /**
     * 方法栈2   ----end----\
     */

}
