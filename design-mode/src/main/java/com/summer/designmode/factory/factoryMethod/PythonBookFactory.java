package com.summer.designmode.factory.factoryMethod;


import com.summer.designmode.factory.Ibook;
import com.summer.designmode.factory.PythonBook;

public class PythonBookFactory implements IBookFactory {
    public Ibook create() {
        return new PythonBook();
    }
}
