package com.ziggy192.decoratorPattern;

public class Espresso extends SizeBeverage {
	public Espresso(Size size) {
		super(size);
	}

	@Override
	public double calculateCost() {
		return 1.99;
	}

	@Override
	public String description() {
		return "Espresso";
	}
}
