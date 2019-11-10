package com.module2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        //part1 - pętla for plus tablica
        System.out.println("Part1: ");
       int[] results = new int[5];
       results[0] = 6;
       results[1] = 4;
       results[2] = 5;
       results[3] = 3;
       results[4] = 2;
       int sum = 0;
       for(int i=0; i<5; i++) {
           System.out.println(results[i]);
           sum += results[i];
       }
       double result = sum / results.length;
       System.out.println(result);
       System.out.println();

        //part2 - wrappery - opakowania dla typów prymitywnych
        System.out.println("Part2: ");

        int age = 10;
        Integer age1 = age;
        int age2 = age1;
        System.out.println(age2);

        boolean isSmall = true;
        Boolean isAverage = isSmall;
        boolean isHigher = isAverage;
        System.out.println(isHigher);

        char sex = 'f';
        Character sex1 = sex;
        char sex2 = sex1;
        System.out.println(sex2);
        System.out.println();

        //part3 - ArrayList
        System.out.println("Part3: ");
        ArrayList<String> books = new ArrayList<>();
        books.add("Book 1");
        books.add("Book 2");
        books.add("Book 3");
        System.out.println("Rozmiar kolejkcji: " + books.size());
        books.remove(1);
        System.out.println("Lista ksiązek po usunięciu jednej pozycji: " + books);
        books.remove(books.size()-1);
        System.out.println("Lista ksiązek po usunięciu kolejnej pozycji: " + books);
        boolean isFull = books.isEmpty();
        System.out.println("Lista książek jest pusta! -  " + isFull);
        books.clear();
        boolean isFull1 = books.isEmpty();
        System.out.println("Lista książek jest pusta! -  " + isFull1);
        books.add("Book one");
        books.add("Book two");
        books.add("Book three");
        books.add("Book four");
        books.add("Book five");
        System.out.println("Lista książek zawiera ksiązkę \"Book three\" " + books.contains("Book three"));
        for(String theBook: books) {
            System.out.println(theBook);
        }
        for(int i=0; i<books.size(); i++) {
            System.out.println(books.get(i));
        }
	    System.out.println();

	    //part4 - LinkedList
	    System.out.println("Part4: ");
        LinkedList<Integer> theList = new LinkedList<>();
        for(int n=0; n<1000; n++) {
            theList.add(n*2);
        }
        System.out.println("List element at 760 index equals: " + theList.get(760));
        System.out.println("Add new element at 760 index - equals - 566");
        theList.add(760, 566);
        System.out.println("I'm checking new element: " + theList.get(760));
        System.out.println("Size collection: " + theList.size());
        theList.remove(2);
        theList.remove();
        System.out.println("Size collection after removing 2 elements: " + theList.size());
        System.out.println();

        //part5 - ArrayList
        System.out.println("Part5: ");
        ArrayList<Integer> informationTechnology = new ArrayList<>();
        informationTechnology.add(3);
        informationTechnology.add(3);
        informationTechnology.add(4);
        informationTechnology.add(5);
        int min = Collections.min(informationTechnology);
        int max = Collections.max(informationTechnology);
        System.out.println(min);
        System.out.println(max);
        double sum5 = 0;
        for(int it: informationTechnology) {
            sum5 += it;
        }
        sum5 = sum5 - min - max;
        double average5 = sum5 / (informationTechnology.size() - 2);
        System.out.println(average5);
        System.out.println();

        //part6 - LinkedList
        System.out.println("Part6: ");
        LinkedList<Book> list = new LinkedList<>();
        Book book1 = new Book("BookOne", 1999);
        Book book2 = new Book("Book2", 2006);
        Book book3 = new Book("Book3", 2007);
        list.add(book1);
        list.add(book2);
        list.add(book3);
        for(Book books6: list) {
            if(books6.getYear() >= 2000) {
                System.out.println(books6.getName() +  " " +  books6.getYear());
            }
        }
    }
}
