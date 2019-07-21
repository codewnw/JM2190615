package com.jm2190615.annotation.predefined.override;

public class Dog extends Animal {
	@Override
	public void sleep() {
		System.out.println("Dog is sleeping.");
	}
}
