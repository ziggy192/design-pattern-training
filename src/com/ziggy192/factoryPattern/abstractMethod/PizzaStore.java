package com.ziggy192.factoryPattern.abstractMethod;

import com.ziggy192.factoryPattern.pizzaModels.Pizza;

public abstract class PizzaStore {
    public abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
