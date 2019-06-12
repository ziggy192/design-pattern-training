package com.ziggy192.factoryPattern.simpleFactoryPattern;

import com.ziggy192.factoryPattern.PizzaFactory;
import com.ziggy192.factoryPattern.pizzaModels.Pizza;
import com.ziggy192.factoryPattern.pizzaModels.chicagoPizzas.ChicagoStyleCheesePizza;
import com.ziggy192.factoryPattern.pizzaModels.chicagoPizzas.ChicagoStyleClamPizza;
import com.ziggy192.factoryPattern.pizzaModels.chicagoPizzas.ChicagoStylePepperoniPizza;
import com.ziggy192.factoryPattern.pizzaModels.chicagoPizzas.ChicagoStyleVeggiePizza;
import com.ziggy192.factoryPattern.pizzaModels.nyPizzas.NYStyleCheesePizza;
import com.ziggy192.factoryPattern.pizzaModels.nyPizzas.NYStyleClamPizza;
import com.ziggy192.factoryPattern.pizzaModels.nyPizzas.NYStylePepperoniPizza;
import com.ziggy192.factoryPattern.pizzaModels.nyPizzas.NYStyleVeggiePizza;

public class ChicagoPizzaFactory implements PizzaFactory {
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
