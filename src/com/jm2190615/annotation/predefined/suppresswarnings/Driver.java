package com.jm2190615.annotation.predefined.suppresswarnings;

public class Driver {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.start();
		bike.move();
		bike.stop();

		Car car = new Car();
		car.start();
		car.move();
		car.stop();
	}
}
