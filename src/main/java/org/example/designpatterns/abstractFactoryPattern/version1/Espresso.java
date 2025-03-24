package org.example.designpatterns.abstractFactoryPattern.version1;

public class Espresso extends Coffee {
    public Espresso(Bean bean, Sugar sugar, Milk milk) {
        super(bean, sugar, milk);
    }

    @Override
    public void brew() {

    }

    @Override
    public void boil() {

    }
}
