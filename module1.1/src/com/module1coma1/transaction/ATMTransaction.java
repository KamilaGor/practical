package com.module1coma1.transaction;

public abstract class ATMTransaction {

	abstract protected void putInCard();

	abstract protected void enterPinNumber();

	abstract protected void enterTheAmount();

	private void paymentExecution() {
		System.out.println("ATM withdraws");
	}
	private void checkAccountBalance() {
		System.out.println("The bank checks the account balance");
	}
	public void run() {
		this.putInCard();
		this.enterPinNumber();
		this.enterTheAmount();
		this.paymentExecution();
		this.checkAccountBalance();
	}
}
