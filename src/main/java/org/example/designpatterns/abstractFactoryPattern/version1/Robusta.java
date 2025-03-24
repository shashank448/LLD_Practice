package org.example.designpatterns.abstractFactoryPattern.version1;

public class Robusta extends Coffee {
    public Robusta(Bean bean, Sugar sugar, Milk milk) {
        super(bean, sugar, milk);
    }

    @Override
    public void brew() {

    }

    @Override
    public void boil() {

    }
}
