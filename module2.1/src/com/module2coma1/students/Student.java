package com.module2coma1.students;

public class Student {
	String name;
	String surname;
	String pesel;

	public Student(String name, String surname, String pesel) {
		this.name = name;
		this.surname = surname;
		this.pesel = pesel;
	}

	@Override
	public boolean equals(Object o) {
		Student s = (Student) o;
		return this.name.equals(s.name) && this.surname.equals(s.surname) && this.pesel.equals(s.pesel);
	}

	@Override
	public int hashCode() {
		return Integer.parseInt(pesel.substring(0,5));
	}

	@Override
	public String toString() {
		return  name + " " + surname + " (" + pesel +")";
	}
}
