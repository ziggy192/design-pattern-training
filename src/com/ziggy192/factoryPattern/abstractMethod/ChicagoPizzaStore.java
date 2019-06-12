package com.ziggy192.factoryPattern.abstractMethod;

import com.ziggy192.factoryPattern.pizzaModels.Pizza;
import com.ziggy192.factoryPattern.pizzaModels.chicagoPizzas.ChicagoStyleCheesePizza;
import com.ziggy192.factoryPattern.pizzaModels.chicagoPizzas.ChicagoStyleClamPizza;
import com.ziggy192.factoryPattern.pizzaModels.chicagoPizzas.ChicagoStylePepperoniPizza;
import com.ziggy192.factoryPattern.pizzaModels.chicagoPizzas.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza =  new ChicagoStyleCheesePizza();
                break;

            case "veggie":
                pizza =  new ChicagoStyleVeggiePizza();
                break;

            case "clam":
                pizza = new ChicagoStyleClamPizza();
                break;

            case "pepperoni":
                pizza  = new ChicagoStylePepperoniPizza();
                break;

        }
        return pizza;
    }
}
