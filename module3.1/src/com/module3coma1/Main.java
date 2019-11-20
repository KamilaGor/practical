package com.module3coma1;

import com.module3coma1.books.Book;
import com.module3coma1.collectionCombinations.TaskManager;
import com.module3coma1.collectionsAsArgumentMethod.ArrayTester;
import com.module3coma1.forWhileLinkedList.MyObject;
import com.module3coma1.snakeLetters.Divider;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //part1
        System.out.println("Part1: LIFO - stack");
        Book book1 = new Book("Title1", "Author1", 2001);
        Book book2 = new Book("Title2", "Author2", 2002);
        Book book3 = new Book("Title3", "Author3", 2003);
        Book book4 = new Book("Title4", "Author1", 2001);
        Book book5 = new Book("Title5", "Author5", 2005);
        ArrayDeque<Book> theQueue = new ArrayDeque<>();
        theQueue.push(book1);
        theQueue.push(book2);
        theQueue.push(book3);
        theQueue.push(book4);
        theQueue.push(book5);
        System.out.println("Size of the filled stack: " + theQueue.size());
        Book temporaryQueue;
        temporaryQueue = theQueue.pop();
        temporaryQueue = theQueue.pop();
        temporaryQueue = theQueue.pop();
        temporaryQueue = theQueue.pop();
        temporaryQueue = theQueue.pop();
        System.out.println("Checking if the stack is empty: " + theQueue.size());
        System.out.println("Last deleted book is: " + temporaryQueue);
        System.out.println();
        //part2
        System.out.println("Part2: While loop");
        theQueue.push(book1);
        theQueue.push(book2);
        theQueue.push(book3);
        Iterator<Book> theList = theQueue.iterator(); // nowy obiekt typu Iterator<Book>
        //musi być przed pętlą(inaczej tworzony byłby każdorazowo nowy iterator,
        // a jego kursor ustawiany byłby przed pierwszym obiektem w kolekcji
        while (theList.hasNext()) {
            Book currentBook = theList.next(); //do zmiennej lokalnej pobierany jest z kol obiekt reprezentujący książkę
            System.out.println(currentBook); //wyświetlany obiekt - wykorzystna met toString()
        }
        System.out.println("Loop has finished its work");
        System.out.println();
        //part3
        System.out.println("Part3: While loop and Random class");
        boolean loggedIn = false;
        int tryCounter = 0;
        Random randomGenerator = new Random();
        while(!loggedIn){
            tryCounter++;
            System.out.println("Waiting for the User to sign in: [attempt # " + tryCounter + "]");
            if(randomGenerator.nextInt(100)>90) {
                loggedIn = true;
            };
        }
        System.out.println("User logged in!");
        System.out.println();
        //part4
        System.out.println("Part4: While loop and Random class - second example");
        int sumA = 1000;
        int sumB = 0;
        int tryCounter1 = 0;
        Random randomGenerator1 = new Random();
        while(sumA>sumB) {
            tryCounter1++;
            System.out.println("Attempt # " + tryCounter1 + " SumA equals: " + sumA + " SumB equals: " + sumB);
            sumA += randomGenerator1.nextInt(10);
            sumB += randomGenerator1.nextInt(50);
        }
        System.out.println();
        //part5
        System.out.println("Part5: Random class");
        ArrayList<Integer> theBigList = new ArrayList<Integer>();
        Random theGenerator = new Random();
        for(int n=0; n < 2000000; n++) {
            theBigList.add(theGenerator.nextInt(50000));
        }
        System.out.println("The Big List contains now " + theBigList.size() + " objects");
	    System.out.println();
	    //part6
	    System.out.println("Part6: Passing the collection as a method argument");
	    ArrayList<Integer> theBigList5 = new ArrayList<>();
	    Random theGenerator5 = new Random();
	    for(int n=0; n < 200; n++) {
	    	theBigList5.add(theGenerator5.nextInt(100));
	    }
	    ArrayTester tester = new ArrayTester();
	    tester.printEven(theBigList5);
	    System.out.println();
	    //part7
	    System.out.println("Part7: Rewriting collection objects into collections");
	    ArrayDeque<String> taskQueue1 = new ArrayDeque<String>();
	    for(int n=0; n < 5; n++) {
	    	taskQueue1.offer("The first task number " + (n+1));
	    }
	    ArrayDeque<String> taskQueue2 = new ArrayDeque<String>();
	    for(int n=0; n < 5; n++) {
	    	taskQueue2.offer("The second task number " + (n+1));
	    }
	    TaskManager taskExecutor = new TaskManager();
	    taskExecutor.executeTasks(taskQueue1);
	    taskExecutor.executeTasks(taskQueue2);
	    System.out.println();
	    //part8
	    System.out.println("Part8: While and For, LinkedList, duplicates");
	    LinkedList<MyObject> listOfNumbers = new LinkedList<MyObject>();
	    Random theGenerator8 = new Random();
	    for(int n=0; n < 100; n++) {
	    	listOfNumbers.add(new MyObject(theGenerator8.nextInt(100)));
	    }
	    Iterator<MyObject> iterator = listOfNumbers.iterator();
	    while(iterator.hasNext()) {
	    	MyObject examinedObject = iterator.next();
	    	for(int k=0; k < listOfNumbers.size(); k++) {
	    		if(listOfNumbers.get(k).hashCode() != examinedObject.hashCode()) {//hashCode w domyślnej postaci można użyć
	    			//do spr, czy porównywane obiekty, to różne obiekty(zwracany jest adres obiektu)
	    			if(listOfNumbers.get(k).equals(examinedObject)) {
					    System.out.println("Duplicated: " + examinedObject.getValue());
				    }
			    }
		    }
	    }
	    System.out.println();
	    //part9
	    System.out.println("Part9: Snake letters");
	    ArrayDeque<String> aQueue = new ArrayDeque<String>();
	    Random theGenerator9 = new Random();
	    for(int n=0; n < 50; n++) {
	    	Integer number = theGenerator9.nextInt(50) +1;
		    System.out.println(number);
		    String a = "";
		    for(int i=1; i<=number; i++) {
		    	a = a +"a";
		    }
		    System.out.println("item: " + n + " " + a);
		    aQueue.offer(a);
	    }
	    Divider divider = new Divider();
	    divider.divideToEvenOrOdd(aQueue);
	    List<String> even = divider.getEvenResult();
	    List<String> odd = divider.getOddResult();
	    System.out.println("Even size:  " + even.size());
	    System.out.println("Odd size: " + odd.size());
    }
}
