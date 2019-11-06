package com.module1.telephones;

public interface Telephone {

	public void callTo(String name);

	public default void callToMom() { //domyślna metoda -czeka na wywołanie, nie trzeba jej nadpisywać
		System.out.println("I'm calling to mom");
	}
	public static void getMyNumber() {
		System.out.println("My number is 8787969");
	}
}
