package com.summer.designmode.factory.simpleFactory;


import com.summer.designmode.factory.Ibook;
import com.summer.designmode.factory.JavaBook;

/**
 * 由一个工厂对象 决定创建出哪一种产品类的实例。
 *
 *  优点：
 * 工厂类的职责相对过重，增加新的产品时需要修改工厂类的判断 逻辑，违背开闭原则。 不易于扩展过于复杂的产品结构。
 * 缺点：
 * 工厂类的职责相对过重，增加新的产品时需要修改工厂类的判断逻辑，违背开闭原则。 不易于扩展过于复杂的产品结构。
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        Ibook ibook = new BookFactory().create(JavaBook.class);
        ibook.name();
    }
}
