package com.ziggy192.factoryPattern.pizzaModels;

public abstract class Pizza {
    protected String name;

    public void prepare() {
        System.out.println("preparing pizza");
    }

    public void bake() {
        System.out.println("baking pizza");
    }

    public void cut() {
        System.out.println("cutting pizza");

    }

    public void box() {
        System.out.println("Boxing pizza");
    }

    public String getName() {
        return name;
    }
}
