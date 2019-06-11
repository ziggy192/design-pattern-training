package com.ziggy192.decoratorPattern;

public class Decaf extends SizeBeverage {


	public Decaf(Size size) {
		super(size);
	}

	@Override
	public double calculateCost() {
		return 1.05;
	}

	@Override
	public String description() {
		return "Decaf";
	}
}
