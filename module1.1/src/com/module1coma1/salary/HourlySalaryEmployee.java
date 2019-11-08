package com.module1coma1.salary;

public class HourlySalaryEmployee implements Emplyee {//pracownicy z wynagrodzeniem za liczbę przepracowanych godzin

	private double hours;
	private double hourlyPay;

	public HourlySalaryEmployee(double hours, double hourlyPay) {
		this.hours = hours;
		this.hourlyPay = hourlyPay;
	}

	public double calculateSalary() {
		return this.hours * this.hourlyPay;
	}
}
