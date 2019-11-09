package com.module2;

import java.util.ArrayList;

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

    }
}
