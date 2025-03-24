package org.example.designpatterns.abstractFactoryPattern.version2;

public class Cappuccino extends Coffee {
    public Cappuccino(IngredientFactory ingredientFactory) {
        super(ingredientFactory);
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
