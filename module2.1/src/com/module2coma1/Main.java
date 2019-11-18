package com.module2coma1;

public class Main {

    public static void main(String[] args) {

    	//part1 - porównywnie obiektów == zawsze false (nie proównoje zawarrości obiektów, a jedynie zawartość zmiennych
	    //wskazujących obiekty, nawet gdy takie same obiekty(będą miały takie same wartości
	    System.out.println("Comparing objects using a sign - always wrong result");
	    Employee worker1 = new Employee("John", "Kowalski", "0001");
	    Employee worker2 = new Employee("Anthony", "Taylor", "0002");
	    System.out.println("worker1 == worker2: " + (worker1 == worker2));
	    System.out.println();
	    Employee worker3 = new Employee("John", "Kowalski", "0001");
	    Employee worker4 = new Employee("John", "Kowalski", "0001");
	    System.out.println("worker3 == worker4: " + (worker3 == worker4));
	    System.out.println();

	    //part 2 - właściwe porównywanie obiektów
	    System.out.println("equals method");
	    Employee worker5 = new Employee("John", "Kowalski", "0001");
	    Employee worker6 = new Employee("John", "Kowalski", "0001");
	    System.out.println("worker5.equals(worker6) : " + (worker5.equals(worker6)));
	    System.out.println();
    }
}
