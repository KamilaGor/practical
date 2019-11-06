package com.module1.atms;

public interface ATM {

	public void payIn(double deposit);

	public void takeOut(double payoff);

	public default void connectWithBank(boolean conection) {
		if(conection == true) {
			System.out.println("Connected to the bank");
		}else{
			System.out.println("Disconnected from the bank");
		}
	}
	public static void endConnection() {
		System.out.println("Bank connection is end.");
	}


}
