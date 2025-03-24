package org.example.designpatterns.factorydesignpattern.finalVersion;

public class CoffeeFactory {
    public Coffee getCoffee(String coffeeType){
        Coffee coffee;
        if(coffeeType.equals("Cappuccino"))
            coffee = new Cappuccino();
        else if(coffeeType.equals("Robusta"))
            coffee = new Robusta();
        else if(coffeeType.equals("Latte"))
            coffee = new Latte();
        else
            coffee = new Espresso();
        return coffee;
    }
}
