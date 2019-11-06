package com.module0.vehicles;

import com.module0.vehicles.Vehicle;

public class Car extends Vehicle {
	private double engineCapasity;

	public Car(String model, String year, double engineCapasity) {
		super(model, year);
		this.engineCapasity = engineCapasity;
	}

	public double getEngineCapasity() {
		return engineCapasity;
	}

	public void turnOnEngine() {
		System.out.println("Silnik włączony!");
	}

	public void turnOffEngine() {
		System.out.println("Silnik wyłączony!");
	}
}
