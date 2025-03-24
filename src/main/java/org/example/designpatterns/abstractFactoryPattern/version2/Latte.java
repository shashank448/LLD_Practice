package org.example.designpatterns.abstractFactoryPattern.version2;

public class Latte extends Coffee {
    public Latte(IngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    public void brew() {

    }

    @Override
    public void boil() {

    }
}
