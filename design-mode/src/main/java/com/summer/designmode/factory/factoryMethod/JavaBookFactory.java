package com.summer.designmode.factory.factoryMethod;


import com.summer.designmode.factory.Ibook;
import com.summer.designmode.factory.JavaBook;

public class JavaBookFactory implements IBookFactory {
    public Ibook create() {
        return new JavaBook();
    }
}
