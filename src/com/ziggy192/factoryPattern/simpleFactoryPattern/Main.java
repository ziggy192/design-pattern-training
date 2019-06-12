package com.ziggy192.factoryPattern.simpleFactoryPattern;

public class Main {
    public static void main(String[] args) {

        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        pizzaStore.orderPizza("cheese");

        pizzaStore.setPizzaFactory(new NYPizzaFactory());
        pizzaStore.orderPizza("veggie");

        pizzaStore.setPizzaFactory(new ChicagoPizzaFactory());
        pizzaStore.orderPizza("clam");





    }
}
