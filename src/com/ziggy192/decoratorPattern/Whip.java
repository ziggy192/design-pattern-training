package com.ziggy192.decoratorPattern;

public class Whip extends CondimentDecorator {
	public Whip(Beverage beverage) {
		super(beverage);
	}

	@Override
	public double calculateCost() {
		return getBeverage().calculateCost() + 0.1;
	}

	@Override
	public String description() {
		return getBeverage().description()+ " Whip";
	}
}
