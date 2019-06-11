package com.ziggy192.decoratorPattern;

public class Mocha extends CondimentDecorator {
	public Mocha(Beverage beverage) {
		super(beverage);
	}

	@Override
	public double calculateCost() {
		double cost = 0;
		switch (getSize()) {
			case LARGE:
				cost = 2d;
				break;
			case SMALL:
				cost = 1d;
				break;
			case MEDIUM:
				cost = 1.5d;
				break;
		}

		System.out.println(description() + " " + (getBeverage().calculateCost() + cost));

		return getBeverage().calculateCost() + cost;
	}

	@Override
	public String description() {
		return getBeverage().description() + " Mocha";
	}
}
