package com.ziggy192.decoratorPattern;

public class HouseBlend extends Beverage {
	@Override
	public double calculateCost() {
		return 0.89;
	}

	@Override
	public String description() {
		return "House Blend";
	}


}
