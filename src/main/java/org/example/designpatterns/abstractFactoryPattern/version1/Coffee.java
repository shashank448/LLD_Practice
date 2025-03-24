package org.example.designpatterns.abstractFactoryPattern.version1;

public abstract class Coffee {
    private final Bean bean;
    private final Sugar sugar;
    private final Milk milk;

    public Coffee(Bean bean, Sugar sugar, Milk milk) {
        this.bean = bean;
        this.sugar = sugar;
        this.milk = milk;
    }

    public void brew();
    public void boil();
}
