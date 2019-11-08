package com.module1coma1.salary;

public class SalaryPayoutProcessor extends SalaryPayout {// klasa zadba o implementację metod kl abstrakcyjnej

	public SalaryPayoutProcessor(Emplyee emplyee) {
		super(emplyee);
	}

	protected void payout() {
		System.out.println("Sending money to employee !");
	}
}
