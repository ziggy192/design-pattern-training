package com.ziggy192.decoratorPattern;

public abstract class CondimentDecorator extends Beverage {
	private Beverage beverage;

	public Beverage getBeverage() {
		return beverage;
	}

	public void setBeverage(Beverage beverage) {
		this.beverage = beverage;
	}

	public CondimentDecorator(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	public abstract String description();

	@Override
	public Size getSize() {
		return beverage.getSize();
	}

	@Override
	public void setSize(Size size) {
		beverage.setSize(size);
	}
}
