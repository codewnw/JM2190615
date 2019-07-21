package com.jm2190615.annotation.predefined.deprecated;

public class Vehicle {

	@Deprecated
	public void start() {
		System.out.println("Vehicle is started");
	}

	public void move() {
		System.out.println("Vehicle is moving");
	}

	public void stop() {
		System.out.println("Vehicle is stopped");
	}
}
