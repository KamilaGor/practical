package com.module3.employees;

import java.time.LocalDate;

public class Employee {

	String firstName;
	String lastName;
	LocalDate birthDate;

	public Employee(String firstName, String lastName, int yearOfBirth, int monthOfBirth, int dayOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
	}

	@Override
	public int hashCode() {
		return birthDate.getYear() * 100 + birthDate.getMonthValue();
	}

	@Override
	public boolean equals(Object o) {
		Employee e = (Employee) o;
		return (firstName.equals(e.getFirstName())) && (lastName.equals(e.getLastName())) && (birthDate.getYear() ==
				e.getBirthDate().getYear()) && (birthDate.getMonthValue() == e.getBirthDate().getMonthValue())
		&& (birthDate.getDayOfMonth() == e.getBirthDate().getDayOfMonth());
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	@Override
	public String toString() {
		return firstName + ", " + lastName + ", " + "born: " + birthDate;
	}
}
