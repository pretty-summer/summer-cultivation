package com.summer.datastructure.stack;

import com.summer.datastructure.exception.StackEmpityException;
import com.summer.datastructure.exception.StackFullException;

public interface SummerStack {
    public int size();
    public Object pop() throws StackEmpityException;
    public void push(Object o) throws StackFullException;
    public Object top() throws StackEmpityException;
    public boolean isEmpity();
}
