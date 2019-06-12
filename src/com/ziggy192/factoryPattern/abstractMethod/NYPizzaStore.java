package com.ziggy192.factoryPattern.abstractMethod;

import com.ziggy192.factoryPattern.pizzaModels.Pizza;
import com.ziggy192.factoryPattern.pizzaModels.nyPizzas.NYStyleCheesePizza;
import com.ziggy192.factoryPattern.pizzaModels.nyPizzas.NYStyleClamPizza;
import com.ziggy192.factoryPattern.pizzaModels.nyPizzas.NYStylePepperoniPizza;
import com.ziggy192.factoryPattern.pizzaModels.nyPizzas.NYStyleVeggiePizza;

public class  NYPizzaStore extends PizzaStore {
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
