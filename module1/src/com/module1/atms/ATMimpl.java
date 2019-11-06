package com.module1.atms;

public class ATMimpl implements ATM {
	@Override
	public void payIn(double deposit) {
		System.out.println("Deposited money: " + deposit);
	}

	@Override
	public void takeOut(double payoff) {
		System.out.println("Money was took out: " + payoff);
	}
}
