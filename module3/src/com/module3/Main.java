package com.module3;

import com.module3.employees.Employee;

import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        //part1 - HASHSET
        System.out.println(" HashSet Example");
        Employee employee = new Employee("John", "Taylor", 1999, 12, 21);
        System.out.println(employee.hashCode());
        System.out.println();

        //part2 - creating HASHSET
        System.out.println(" Creating HashSet Example");
        Employee employee1 = new Employee("John", "Nowak", 1992, 4,4);
        Employee employee2 = new Employee("Ann", "Taylor", 1992, 4,13);
        Employee employee3 = new Employee("Michael", "Pinelli", 1990, 5,4);
        Employee employee4 = new Employee("Paul", "Kowalski", 1990, 5,5);
        Employee employee5 = new Employee("Anthony", "Jantar", 1991, 12,31);

        HashSet<Employee> employeesSet = new HashSet<Employee>();
        employeesSet.add(employee1);
        employeesSet.add(employee2);
        employeesSet.add(employee3);
        employeesSet.add(employee4);
        employeesSet.add(employee5);

        System.out.println("Employee3 exists in the set: " + employeesSet.contains(employee3));
        System.out.println();

        //part3 - HASHSET operations
        System.out.println(" HashSet operations Example");
        System.out.println("Employees: ");
        for(Employee theEmployee: employeesSet) {
            System.out.println(theEmployee);
        }

        System.out.println();
        System.out.println("Employees born in or after 1991: ");
        for(Employee theEmployee: employeesSet) {
            if(theEmployee.getBirthDate().getYear() >= 1991) {
                System.out.println("Employees born in or after 1991 " + theEmployee);
            }
        }
    }
}
