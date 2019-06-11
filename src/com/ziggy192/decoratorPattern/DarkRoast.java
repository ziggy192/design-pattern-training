package com.ziggy192.decoratorPattern;

public class DarkRoast extends SizeBeverage {


	public DarkRoast(Size size) {
		super(size);
	}

	@Override
	public double calculateCost() {
		return 0.99;
	}



	@Override
	public String description() {
		return "Dark Roast";
	}
}
