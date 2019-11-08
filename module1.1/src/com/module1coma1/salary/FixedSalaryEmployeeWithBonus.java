package com.module1coma1.salary;

public class FixedSalaryEmployeeWithBonus implements Emplyee {

	private double salary;
	private boolean isSoldAnything;

	public FixedSalaryEmployeeWithBonus(double salary, boolean isSoldAnything) {
		this.salary = salary;
		this.isSoldAnything = isSoldAnything;
	}

	public double calculateSalary() {
		return salary + 0.2*salary;
	}
}
