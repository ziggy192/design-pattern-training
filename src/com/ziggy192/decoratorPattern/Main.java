package com.ziggy192.decoratorPattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
		Beverage whip = new Whip(new Mocha(new Mocha(new DarkRoast())));
		Beverage order2 = new Espresso();
		Beverage order3 = new Whip(new Soy(new Mocha(new HouseBlend())));
		System.out.println(whip.description() + " " + whip.calculateCost());
		System.out.println(order2.description() + " " + order2.calculateCost());
		System.out.println(order3.description() + " " + order3.calculateCost());
	}
}
