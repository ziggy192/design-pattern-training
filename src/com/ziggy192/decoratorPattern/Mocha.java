package com.ziggy192.decoratorPattern;

public class Mocha extends CondimentDecorator {
	public Mocha(Beverage beverage) {
		super(beverage);
	}

	@Override
	public double calculateCost() {
		return getBeverage().calculateCost() + 0.2;
	}

	@Override
	public String description() {
		return getBeverage().description() + " Mocha";
	}
}
