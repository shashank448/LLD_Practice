package org.example.designpatterns.abstractFactoryPattern.version2;

public interface IngredientFactory {
    public Bean getBean();
    public Sugar getSugar();
    public Milk getMilk();
}
