package com.summer.designmode.factory.simpleFactory;


import com.summer.designmode.factory.Ibook;

public class BookFactory {
    public Ibook create(Class clazz){
        return create2(clazz);
    }


    private Ibook create2(Class clazz){
        if(null != clazz){
            try {
                return (Ibook) clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
