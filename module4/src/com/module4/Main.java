package com.module4;

import com.module4.orders.Order;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

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
    }
}
