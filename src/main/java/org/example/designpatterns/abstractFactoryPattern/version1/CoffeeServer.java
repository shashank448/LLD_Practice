package org.example.designpatterns.abstractFactoryPattern.version1;

public class CoffeeServer {
    public Coffee serve(String coffeeType){
        Coffee coffee = new CoffeeFactory().getCoffee(coffeeType);
        coffee.brew();
        coffee.boil();
        return coffee;
    }
}
/**
 *                  CoffeeServer
 *          /           |         \         \
 *      Cappucino   Robusta     Latte   Espresso
 *
 *      So this CoffeeServer is depending on multiple concrete classes which is not a good way
 *
 *      One can think of, we can have Coffee being passed in serve method and this creational responsibility is not on CoffeeServer
 *
 *      if you look closely, below code is holding the creational responsibility
 *      and this cannot be avoided, the better way would be transfer this creational responsibiltiy to a separate class
 *      and this class can be centralised class and this can be used by other classes, lets say there is some logic for PriceCalculator
 *      again this priceCalculator will use this centralised class for getting the rate for a particular coffeeType
 *      
 *
 *
 *      if(coffeeType.equals("Cappuccino"))
 *             coffee = new Cappuccino();
 *         else if(coffeeType.equals("Robusta"))
 *             coffee = new Robusta();
 *         else if(coffeeType.equals("Latte"))
 *             coffee = new Latte();
 *         else
 *             coffee = new Espresso();
 * */
