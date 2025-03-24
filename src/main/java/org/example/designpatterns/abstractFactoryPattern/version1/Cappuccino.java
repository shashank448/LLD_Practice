package org.example.designpatterns.abstractFactoryPattern.version1;

public class Cappuccino extends Coffee {
    public Cappuccino(Bean bean, Sugar sugar, Milk milk) {
        super(bean, sugar, milk);
    }

    @Override
    public void brew() {

    }

    @Override
    public void boil() {

    }
}

/**
 * Cappuccino needs : american bean + brown sugar + cow milk
 * espresso
 * **/
