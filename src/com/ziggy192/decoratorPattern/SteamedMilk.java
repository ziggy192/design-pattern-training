package com.ziggy192.decoratorPattern;

public class SteamedMilk extends CondimentDecorator {
	public SteamedMilk(Beverage beverage) {
		super(beverage);
	}

	@Override
	public double calculateCost() {
		return getBeverage().calculateCost() + 0.1;
	}

	@Override
	public String description() {
		return getBeverage().description() + " Steamed Milk";
	}
}
