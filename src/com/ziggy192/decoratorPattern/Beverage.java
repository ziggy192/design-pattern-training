package com.ziggy192.decoratorPattern;

public abstract class Beverage {


	public abstract double calculateCost();
	public abstract String description();



	public abstract Size getSize() ;

	public abstract void setSize(Size size) ;

	enum Size{
		SMALL,
		MEDIUM,
		LARGE
	}
}
