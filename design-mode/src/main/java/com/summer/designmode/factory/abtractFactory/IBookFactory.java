package com.summer.designmode.factory.abtractFactory;

import com.summer.designmode.factory.INote;
import com.summer.designmode.factory.Ibook;

public interface IBookFactory {
    public Ibook createBook();
    public INote createNote();
}
