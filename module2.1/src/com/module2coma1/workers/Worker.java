package com.module2coma1.workers;

public class Worker {
	String firstName;
	String lastName;
	String peselID;

	public Worker(String firstName, String lastName, String peselID) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.peselID = peselID;
	}

	@Override
	public boolean equals(Object o) {
		final Worker e = (Worker) o;
		return this.firstName.equals(e.firstName) && this.lastName.equals(e.lastName) && this.peselID.equals(e.peselID);
	}

	@Override
	public int hashCode() {
		return Integer.parseInt(peselID.substring(0, 5));
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + " " + " (" + peselID + ") ";
	}
}
