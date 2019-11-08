package com.module1coma1.people;

abstract class Person { //kl.abstarkcyjna

	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public abstract void voice(); //metoda abstrakycjna nie ma ciała
}
