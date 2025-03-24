package org.example.designpatterns.abstractFactoryPattern.version1;

public class CoffeeFactory {
    public Coffee getCoffee(String coffeeType){
        Coffee coffee;
        if(coffeeType.equals("Cappuccino"))
            coffee = new Cappuccino(new AmericanBean(), new RegularSugar(), new CowMilk());
        else if(coffeeType.equals("Robusta"))
            coffee = new Robusta(new FrenchBean(), new BrownSugar(), new PowderedMilk());
        else if(coffeeType.equals("Latte"))
            coffee = new Latte(new AmericanBean(), new RegularSugar(), new PowderedMilk());
        else
            coffee = new Espresso(new FrenchBean(), new BrownSugar(), new CowMilk());
        return coffee;

    }
}

/**
 * This class was already being burdened with Creational Responsibility
 * Now it also depends on remembering the recipe/ingredients
 * But ideally this class should only need to gather the right kind of coffee object
 * Here for Cappuccino coffee you need to know the ingredients
 * TO REMOVE THIS - one can think of having 3 more factories which can provide you the right kind of
 * ingredient for particular kind of Coffee
 * BUT again if you think on high level, still this CoffeeFactory needs to know about high level ingredients like Bean, SUgar and Milk
 * Suppose some day, one more attribute being added in Coffee
 * lets say spice then we need to have one more factory SpiceFactory for getting the particular kind of
 * spice
 * again on high level, CoffeeFactory needs to know about spice as well
 *
 *
 * OVERALL we want to achive like the knowledge of ingredient for a kind of Coffee needs to be abstracted out
 * Lets say there is an entity class which knows about the ingredients of each type of Coffee
 * Now we need to call it like : new Cappuccino(e);
 * we need to pass the correct type of entity in each type of Coffee
 * e.getBean() should give the particular type of bean for a particular kind of coffee.
 * e.getMilk() should give the particular type of milk for a particular kind of coffee.
 * Similarly e.getSugar()
 * I am making these changes in version 2
 *
 * */
