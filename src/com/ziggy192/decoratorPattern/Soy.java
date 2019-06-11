package com.ziggy192.decoratorPattern;

public class Soy extends CondimentDecorator {
	public Soy(Beverage beverage) {
		super(beverage);
	}

	@Override
	public double calculateCost() {
		return getBeverage().calculateCost() + 0.15;
	}

	@Override
	public String description() {
		return getBeverage().description() + " Soy";
	}
}
