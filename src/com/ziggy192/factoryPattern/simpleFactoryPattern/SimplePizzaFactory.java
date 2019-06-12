package com.ziggy192.factoryPattern.simpleFactoryPattern;

import com.sun.org.apache.regexp.internal.RE;
import com.ziggy192.factoryPattern.PizzaFactory;
import com.ziggy192.factoryPattern.pizzaModels.*;

public class SimplePizzaFactory implements PizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza =  new CheesePizza();
            case "veggie":
                pizza =  new VeggiePizza();
            case "clam":
                pizza = new ClamPizza();
            case "pepperoni":
                pizza  = new PepperoniPizza();
        }
        return pizza;



    }
}
