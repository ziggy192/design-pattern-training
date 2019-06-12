package com.ziggy192.factoryPattern;

import com.ziggy192.factoryPattern.pizzaModels.Pizza;

public interface PizzaFactory
{
    public Pizza createPizza(String type);
}
