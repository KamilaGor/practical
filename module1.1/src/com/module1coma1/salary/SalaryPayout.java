package com.module1coma1.salary;

abstract class SalaryPayout {//metody odp za wykonanie przelewu i wyświetlenie informacji o zrealizowanym przelewie

	private Emplyee emplyee;

	public SalaryPayout(Emplyee emplyee) {
		this.emplyee = emplyee;
	}

	protected abstract void payout();

	public void processPayout() {
		System.out.println("Creating payout for: " + this.emplyee.calculateSalary() + " PLN");
		this.payout();
		System.out.println("Payout has been comleted! ");
	}
}
