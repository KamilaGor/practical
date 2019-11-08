package com.module1coma1.transaction;

public class BankTransaction extends ATMTransaction{


	protected void putInCard() {
		System.out.println("Put your card in");
	}

	protected void enterPinNumber() {
		System.out.println("Enter your PIN number");
	}

	protected void enterTheAmount() {
		System.out.println("Enter the amoun of money");
	}
}
