package com.ziggy192.decoratorPattern;

public class DarkRoast extends Beverage {
	@Override
	public double calculateCost() {
		return 0.99;
	}

	@Override
	public String description() {
		return "Dark Roast";
	}
}
