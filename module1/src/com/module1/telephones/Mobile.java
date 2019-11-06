package com.module1.telephones;

public class Mobile implements Telephone {

	String name;

	@Override
	public void callTo(String name) {
		System.out.println("I'm calling to: " + name);
	}
}
