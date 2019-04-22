package com.summer.datastructure.stack;

import com.summer.datastructure.exception.StackEmpityException;
import com.summer.datastructure.exception.StackFullException;

/**
 * 栈：先进后出
 *
 * 1可用于数据反转
 *
 * 缺点：，还没实现动态扩容
 */
public class SummerSimpleStack implements SummerStack{
    //初始值为-1  因为数组下表从0开始
    private int top=-1;
    private static final int DEFAULT_CAPACITY=10;
    private Object[] stack;

    private int capacity;

    public SummerSimpleStack(int capacity) {
        this.capacity = capacity;
        stack = new Object[capacity];
    }

    public SummerSimpleStack() {
        this(DEFAULT_CAPACITY);
    }

    @Override
    public int size() {
        return top+1;
    }

    @Override
    public Object pop() throws StackEmpityException {
        if(isEmpity()){
            throw new StackEmpityException("stack is empity");
        }
        Object back = stack[top];
        //弹出的下表指向null，利于垃圾回收 ，同时下标减1
        stack[top--]=null;
        return back;
    }

    @Override
    public void push(Object o) throws StackFullException {
        if(size() == capacity){
            throw new StackFullException("stack is full");
        }
        stack[++top] = o;
    }

    @Override
    public Object top() throws StackEmpityException {
        if(isEmpity()){
            throw new StackEmpityException("stack is empity");
        }
        return stack[top];
    }

    @Override
    public boolean isEmpity() {
        return top < 0;
    }
}
