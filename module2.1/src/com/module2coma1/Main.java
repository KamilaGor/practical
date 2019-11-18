package com.module2coma1;

import com.module2coma1.accessors.AccessorsExample;
import com.module2coma1.students.Marks;
import com.module2coma1.students.Student;
import com.module2coma1.workers.SalaryParameters;
import com.module2coma1.workers.Worker;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

    	//part1 - porównywnie obiektów == zawsze false (nie proównoje zawarrości obiektów, a jedynie zawartość zmiennych
	    //wskazujących obiekty, nawet gdy takie same obiekty(będą miały takie same wartości
	    System.out.println("PART1: Comparing objects using a sign - always wrong result");
	    Employee employee1 = new Employee("John", "Kowalski", "0001");
	    Employee employee2 = new Employee("Anthony", "Taylor", "0002");
	    System.out.println("employee1 == employee2: " + (employee1 == employee2));
	    System.out.println();
	    Employee employee3 = new Employee("John", "Kowalski", "0001");
	    Employee employee4 = new Employee("John", "Kowalski", "0001");
	    System.out.println("employee3 == employee4: " + (employee3 == employee4));
	    System.out.println();

	    //part 2 - właściwe porównywanie obiektów
	    System.out.println("PART2: equals method");
	    Employee employee5 = new Employee("John", "Kowalski", "0001");
	    Employee employee6 = new Employee("John", "Kowalski", "0001");
	    System.out.println("employee5.equals(employee6) : " + (employee5.equals(employee6)));
	    System.out.println();

	    //part 3 - HASHMAP
	    System.out.println("PART3: Creating HashMap: ");
	    Worker worker1 = new Worker("John", "Nowak", "1234567890");
	    Worker worker2 = new Worker("Ann", "Taylor", "234567891");
	    Worker worker3 = new Worker("Elizabeth", "Pinelli", "345678912");

	    SalaryParameters params1 = new SalaryParameters(1000.0, 100.0, 10.0, 0.0);
	    SalaryParameters params2 = new SalaryParameters(2000.0, 200.0, 0.0, 20.0);
	    SalaryParameters params3 = new SalaryParameters(3000.0, 0.0, 300.0, 30.0);

	    HashMap<Worker, SalaryParameters> paymentParameters = new HashMap<Worker, SalaryParameters>();
	    paymentParameters.put(worker1, params1);
	    paymentParameters.put(worker2, params2);
	    paymentParameters.put(worker3, params3);

	    System.out.println("Salary of John Nowak equls: " + paymentParameters.get(worker1));
	    System.out.println("Salary of Ann Taylor equls: " + paymentParameters.get(worker2));
	    System.out.println("Salary of Elizabeth Pinelli equls: " + paymentParameters.get(worker3));
	    System.out.println();

	    System.out.println("Using for-each loop");
	    for(Map.Entry<Worker, SalaryParameters> entry1: paymentParameters.entrySet()) {
		    System.out.println("Salary of " + entry1.getKey() + " equals: " + entry1.getValue());
	    }
	    System.out.println();
	    System.out.println("Using for-each loop to the program displays a salary of over 2000 ");
	    for(Map.Entry<Worker, SalaryParameters> entry1: paymentParameters.entrySet()) {
	    	if(entry1.getValue().getBaseSalary() > 2000)
		    System.out.println("Salary of " + entry1.getKey() + " equals: " + entry1.getValue());
	    }
	    System.out.println();

	    //part 4 - ACCESSORS
	    System.out.println("PART4: ACCESSORS: ");
	    AccessorsExample obj = new AccessorsExample();
	    obj.setProperty(17);
	    System.out.println(obj.getProperty());
	    System.out.println();

	    //part 5 - ENTRY
	    System.out.println("PART4: ENTRY: ");
	    HashMap<Integer, String> theMap = new HashMap<Integer, String>();
	    theMap.put(1, "One");
	    theMap.put(2, "Two");
	    theMap.put(3, "Three");
	    for(Map.Entry<Integer, String> entry: theMap.entrySet()) {
		    System.out.println("Object: <" + entry.getKey() + " " + entry.getValue() + ">");
	    }
	    System.out.println();

	    //part 6 - HASHMAP
	    System.out.println("PART6: HASH MAP: STUDENTS ");
	    Student student1 = new Student("Mark", "Kloc", "0987654321");
	    Student student2 = new Student("Kate", "Banach", "9876543210");
	    Student student3 = new Student("Tom", "Wielgosz", "8765432109");

	    Marks mar1 = new Marks(2, 3, 4, 2, 3);
	    Marks mar2 = new Marks(4, 5, 4, 5, 4);
	    Marks mar3 = new Marks(3, 3, 5, 4, 3);

	    HashMap<Student, Marks> theMark = new HashMap<Student, Marks>();
	    theMark.put(student1, mar1);
	    theMark.put(student2, mar2);
	    theMark.put(student3, mar3);

	    for(Map.Entry<Student, Marks> entry2: theMark.entrySet()) {
		    System.out.println("Average grade of: " + entry2.getKey() + " equals - " + entry2.getValue().getAverage());
	    }
    }
}
