package com.module2coma1;

public class Employee {
	String firstname;
	String lastname;
	String peselId;

	public Employee(String firstname, String lastname, String peselId) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.peselId = peselId;
	}
	public boolean equals(Object o) {
		Employee e = (Employee) o; //rzutuję przyjęty typ argumentu na typ employee, aby móc pobrać wartości zmiennych,
		//bo klasie Object nie ma zmiennych firstname, lastname i peselId;
		return this.firstname.equals(e.firstname) && this.lastname.equals(e.lastname) && this.peselId.equals(e.peselId);
		//e.firstname - oznacza  pobranie wartości firstname z obiektu, który został przyjęty w argumencie metody, a następnie
		//zrzutowany na typ Employee
	}
}
