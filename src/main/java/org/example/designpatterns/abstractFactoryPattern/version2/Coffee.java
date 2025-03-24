package org.example.designpatterns.abstractFactoryPattern.version2;

public abstract class Coffee {
    private final Bean bean;
    private final Sugar sugar;
    private final Milk milk;
    private final IngredientFactory ingredientFactory;

    public Coffee(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        this.bean = ingredientFactory.getBean();
        this.sugar = ingredientFactory.getSugar();
        this.milk = ingredientFactory.getMilk();
    }

    public abstract void brew();
    public abstract void boil();
}
