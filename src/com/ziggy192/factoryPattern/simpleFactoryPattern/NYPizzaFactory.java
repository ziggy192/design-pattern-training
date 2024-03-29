package com.ziggy192.factoryPattern.simpleFactoryPattern;

import com.ziggy192.factoryPattern.PizzaFactory;
import com.ziggy192.factoryPattern.pizzaModels.*;
import com.ziggy192.factoryPattern.pizzaModels.nyPizzas.NYStyleCheesePizza;
import com.ziggy192.factoryPattern.pizzaModels.nyPizzas.NYStyleClamPizza;
import com.ziggy192.factoryPattern.pizzaModels.nyPizzas.NYStylePepperoniPizza;
import com.ziggy192.factoryPattern.pizzaModels.nyPizzas.NYStyleVeggiePizza;

public class NYPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza =  new NYStyleCheesePizza();
                break;

            case "veggie":
                pizza =  new NYStyleVeggiePizza();
                break;

            case "clam":
                pizza = new NYStyleClamPizza();
                break;

            case "pepperoni":
                pizza  = new NYStylePepperoniPizza();
                break;

        }
        return pizza;
    }
}
