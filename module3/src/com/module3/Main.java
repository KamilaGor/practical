package com.module3;

import com.module3.books.Book;
import com.module3.employees.Employee;
import com.module3.orders.Boook;
import com.module3.orders.Order;

import java.util.ArrayDeque;
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
        System.out.println();

        //part4 - HASHSET2 operations
        System.out.println(" HashSet2 operations Example");
        Book book1 = new Book("Title1", "Author1", 2001);
        Book book2 = new Book("Title2", "Author2", 2002);
        Book book3 = new Book("Title3", "Author3", 2003);
        Book book4 = new Book("Title4", "Author4", 2004);
        Book book5 = new Book("Title5", "Author5", 2005);

        HashSet<Book> bookList = new HashSet<Book>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        System.out.println("All books: ");
        for(Book theBook: bookList) {
            System.out.println(theBook);
        }
        System.out.println();
        System.out.println("Books published after 2003: ");
        for(Book theBook1: bookList) {
            if(theBook1.getYear() > 2003) {
                System.out.println(theBook1);
            }
        }
        System.out.println();

        //part5 - QUEUE
        System.out.println(" QUEUE");
        Boook theBook = new Boook("Title", "Author", 2003);
        Order theOrder = new Order(theBook, 2019, 11,19);
        System.out.println(theOrder);
        System.out.println();

        //part6 - ARRAYDEQUE
        System.out.println(" ArrayDeque - FIFO Example");
        Boook theBoook1 = new Boook("Title1", "Author1", 2001);
        Boook theBoook2 = new Boook("Title2", "Author2", 2002);
        Boook theBoook3 = new Boook("Title3", "Author3", 2003);

        Order theOrder1 = new Order(theBoook1, 2019, 11,9);
        Order theOrder2 = new Order(theBoook2, 2019, 11,11);
        Order theOrder3 = new Order(theBoook3, 2019, 11,15);
        Order theOrder4 = new Order(theBoook3, 2019, 11,22);
        Order theOrder5 = new Order(theBoook1, 2019, 11,29);

        ArrayDeque<Order> theOrders = new ArrayDeque<Order>();
        theOrders.offer(theOrder1);
        theOrders.offer(theOrder2);
        theOrders.offer(theOrder3);
        theOrders.offer(theOrder4);
        theOrders.offer(theOrder5);
        System.out.println("Queue is filled. It's size: " + theOrders.size());
        System.out.println("First order in the queue is: \n" + theOrders.peek());
        Order temporaryOrder;
        temporaryOrder = theOrders.poll();
        temporaryOrder = theOrders.poll();
        temporaryOrder = theOrders.poll();
        temporaryOrder = theOrders.poll();
        temporaryOrder = theOrders.poll();
        System.out.println("Queue is emtied. It's size: " + theOrders.size());
        System.out.println("Last order taken from queue was: \n" + temporaryOrder);
    }
}
