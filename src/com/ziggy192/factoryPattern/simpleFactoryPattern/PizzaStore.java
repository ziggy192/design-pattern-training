package com.ziggy192.factoryPattern.simpleFactoryPattern;

import com.ziggy192.factoryPattern.PizzaFactory;
import com.ziggy192.factoryPattern.pizzaModels.CheesePizza;
import com.ziggy192.factoryPattern.pizzaModels.ClamPizza;
import com.ziggy192.factoryPattern.pizzaModels.Pizza;
import com.ziggy192.factoryPattern.pizzaModels.VeggiePizza;

public class PizzaStore {
    PizzaFactory pizzaFactory;

    public PizzaStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = pizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public PizzaFactory getPizzaFactory() {
        return pizzaFactory;
    }

    public void setPizzaFactory(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }
}
