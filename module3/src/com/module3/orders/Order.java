package com.module3.orders;

import java.time.LocalDate;

public class Order {
	Boook boook;
	LocalDate dateOfOrder;

	public Order(Boook boook, int year, int month, int day) {
		this.boook = boook;
		this.dateOfOrder = LocalDate.of(year, month, day);
	}

	@Override
	public String toString() {
		return "Order created: " + dateOfOrder + "\n" + "ordered book: " + boook;
	}

	public Boook getBoook() {
		return boook;
	}

	public LocalDate getDateOfOrder() {
		return dateOfOrder;
	}
}
