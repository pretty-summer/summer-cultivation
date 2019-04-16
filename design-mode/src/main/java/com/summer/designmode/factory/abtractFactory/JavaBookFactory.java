package com.summer.designmode.factory.abtractFactory;


import com.summer.designmode.factory.INote;
import com.summer.designmode.factory.Ibook;
import com.summer.designmode.factory.JavaBook;
import com.summer.designmode.factory.JavaNote;

public class JavaBookFactory implements IBookFactory {

    public Ibook createBook() {
        return new JavaBook();
    }

    public INote createNote() {
        return new JavaNote();
    }
}
