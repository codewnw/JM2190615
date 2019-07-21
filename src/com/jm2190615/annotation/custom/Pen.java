package com.jm2190615.annotation.custom;

@ClassInfo
@Myannotation
public class Pen {
	//@Myannotation
	private int age;
	
	//@ClassInfo
	@Myannotation
	public void write() {
		System.out.println("Writing..");
	}
}
