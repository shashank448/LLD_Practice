package org.example.designpatterns.abstractFactoryPattern.version2;

public class Espresso extends Coffee {
    public Espresso(IngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    public void brew() {

    }

    @Override
    public void boil() {

    }
}
