package org.example.designpatterns.abstractFactoryPattern.version2;

public class RobustaIngredientFactory implements IngredientFactory {
    @Override
    public Bean getBean() {
        return new FrenchBean();
    }

    @Override
    public Sugar getSugar() {
        return new BrownSugar();
    }

    @Override
    public Milk getMilk() {
        return new PowderedMilk();
    }
}
