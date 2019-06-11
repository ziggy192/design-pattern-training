package com.ziggy192.decoratorPattern;

public class HouseBlend extends SizeBeverage {
	public HouseBlend(Size size) {
		super(size);
	}

	@Override
	public double calculateCost() {
		return 0.89;
	}

	@Override
	public String description() {
		return "House Blend";
	}


}
