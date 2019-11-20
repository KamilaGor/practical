package com.module4.orders;

import java.time.LocalDate;

public class Order {
	int numberOfOrder;
	String firstname;
	String lastname;
	LocalDate dateOfOrder;

	public Order(int numberOfOrder, String firstname, String lastname, int year, int month, int day) {
		this.numberOfOrder = numberOfOrder;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dateOfOrder = LocalDate.of(year, month, day);
	}

	@Override
	public String toString() {
		return	"NumberOfOrder = " + numberOfOrder +
				", firstname = " + firstname + '\'' +
				", lastname = " + lastname + '\'' +
				", dateOfOrder = " + dateOfOrder;
	}

	public int getNumberOfOrder() {
		return numberOfOrder;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public LocalDate getDateOfOrder() {
		return dateOfOrder;
	}

	@Override
	public boolean equals(Object o) {
		Order e = (Order) o;
		return numberOfOrder == e.numberOfOrder && firstname.equals(e.getFirstname()) && lastname.equals(e.getLastname()) &&
				dateOfOrder.getYear() == e.dateOfOrder.getYear() && dateOfOrder.getMonthValue() == e.dateOfOrder.getMonthValue() &&
				dateOfOrder.getDayOfMonth() == e.dateOfOrder.getDayOfMonth();
	}

	@Override
	public int hashCode() {
		return dateOfOrder.getYear() * 100 + dateOfOrder.getMonthValue();
	}
}
