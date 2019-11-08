package com.module1coma1.salary;

public class FixedSalaryEmployee implements Emplyee { //pracownicy ze stałą pensją

	private double salary;

	public FixedSalaryEmployee(double salary) {
		this.salary = salary;
	}

	public double calculateSalary() {
		return this.salary;
	}
}
