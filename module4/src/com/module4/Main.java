package com.module4;

import com.module4.cannons.Cannon;
import com.module4.colorshashmap.Copier;
import com.module4.orders.Order;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //part1 - LinkedList
        System.out.println("Part1 - task: ArrayList");
        List<String> companies = new ArrayList<>();
        companies.add("Dell");
        companies.add("Apple");
        companies.add("Samsung");
        companies.add("Sony");
        companies.add("Alcatel");
        String companiesList = "";
        for(int i=0; i<companies.size(); i++) {
            if(i==companies.size()-1){
                companiesList += companies.get(i);
            } else {
                companiesList += companies.get(i) + ", ";
            }
        }
        System.out.println("Companies list: " + companiesList);
        System.out.println();
        //part2 - HashSet
        System.out.println("Part2 - HashSet: Duplcated orders");
        Order order1 = new Order(1, "John", "Taylor", 2001, 1, 1);
        Order order2 = new Order(2, "Ann", "Kowalski", 2002, 2, 2);
        Order order3 = new Order(3, "Tommy", "Lee", 2003, 3, 3);
        Order order11 = new Order(1, "John", "Taylor", 2001, 1, 1);
        Order order22 = new Order(22, "John", "Taylor", 2001, 1, 12);

        HashSet<Order> theOrdersSet = new HashSet<>();
        theOrdersSet.add(order1);
        theOrdersSet.add(order2);
        theOrdersSet.add(order3);
        theOrdersSet.add(order11);
        theOrdersSet.add(order22);
        System.out.println("Size of set: " + theOrdersSet.size());
        for(Order theOrder: theOrdersSet) {
            System.out.println(theOrder);
        }
        System.out.println();
        //part3 - HashSet
        System.out.println("Part3 - HashMap: copying map values to another map ");
        Map<Integer, String> myFavouriteMap = new HashMap<Integer, String>();
        Map<Integer, String> myFriendFavouriteMap = new HashMap<Integer, String>();
        myFavouriteMap.put(1, "Red");
        myFavouriteMap.put(2, "Green");
        myFavouriteMap.put(3, "Black");
        System.out.println("Values in first map: " + myFavouriteMap);
        myFriendFavouriteMap.put(4, "White");
        myFriendFavouriteMap.put(5, "Blue");
        myFriendFavouriteMap.put(6, "Orange");
        System.out.println("Values in second map: " + myFriendFavouriteMap);
        Map<Integer, String> ourFavouriteColors = new HashMap<Integer, String>();
        Copier copier = new Copier();
        copier.duplicateMap(myFavouriteMap, ourFavouriteColors);
        copier.duplicateMap(myFriendFavouriteMap, ourFavouriteColors);
        System.out.println("Values in common map: " + ourFavouriteColors);
        System.out.println();
        //part4 - HashSet
        System.out.println("Part4 - LinkedList: cannons collections ");
        Cannon cannon1 = new Cannon(true);
        Cannon cannon2 = new Cannon(false);
        Cannon cannon3 = new Cannon(false);
        Cannon cannon4 = new Cannon(true);
        LinkedList<Cannon> cannonsList = new LinkedList<>();
        cannonsList.add(cannon1);
        cannonsList.add(cannon2);
        cannonsList.add(cannon3);
        cannonsList.add(cannon4);
        for(int i = 0; i<cannonsList.size(); i++) {
            System.out.println("Cannon number: " + (i+1));
            cannonsList.get(i).fire();
            System.out.println("Cannon is loaded: " + cannonsList.get(i).isLoaded());
            System.out.println();
        }
        for(int i = 0; i<cannonsList.size(); i++) {
            cannonsList.get(i).setLoaded(true);
            System.out.println("Cannon number: " + (i + 1) + " is loaded: " + cannonsList.get(i).isLoaded());
            System.out.println();
        }

    }
}
