package com.module0;

import com.module0.animals.Dog;
import com.module0.forum.ForumUser;
import com.module0.people.Human;
import com.module0.people.Person;
import com.module0.vehicles.Car;
import com.module0.vehicles.Vehicle;

public class Main {

    public static void main(String[] args) {
        //part1 boolean if
        System.out.println("Część 1");
        Person janek = new Person("Janek", 23, 1.56, 'm', true);
        boolean result = janek.isGoodProgramer();
        if(result) {
            System.out.println("Janek jest dobrym programistą!");
        } else {
            System.out.println("Janek musi się dużo uczyć !");
        }
        System.out.println();

        //part2 modulo%
        System.out.println("Część 2");
        int firstNumber = 49;
        int secondNumber = 7;
        double result1 = firstNumber % secondNumber;
        if(result1==0) {
            System.out.println("Liczba 7 jest dzielnikiem liczby: " + firstNumber);
        } else {
            System.out.println("Liczba 7 nie jest dzielnikiem liczby: " + firstNumber);
        }
        System.out.println();

        //part3 tablica
        System.out.println("Część 3");
        String names[] = new String[5];
        names[0] = "Janek";
        names[1] = "Antek";
        names[2] = "Asia";
        names[3] = "Zusa";
        names[4] = "Tomek";
        String result2 = names[2];
        System.out.println(result2);
        System.out.println();

        // part4  tworzenie obiektu
        System.out.println("Część 4");
        Human michal = new Human("Michał", "male");
        String name = michal.getName();
        String sex = michal.getSex();
        System.out.println("Użytkownik ma na imię: " + name + " płeć: " + sex);
        System.out.println();

        // part5 dziedziczenie, rzutowanie, polimorfizm
        System.out.println("Część 5");
        Vehicle honda = new Car("honda", "2008", 2.00);
        String model = honda.getModel();
        double capasity = ((Car)honda).getEngineCapasity();
        System.out.println("Sprzedaję samochód o marce: " + model + " i pojemności silnika: " + capasity);
        System.out.println();

        // part6 dziedziczenie metod
        System.out.println("Część 6 ");
        Dog pikus = new Dog ("Pikuś", 2);
        String dogName = pikus.getName();
        int dogAge = pikus.getAge();
        String result6 = pikus.eat();
        System.out.println( result6 + " dla psa o imieniu: " + dogName);
        System.out.println();

        // part7 dziedziczenie metoda super()
        System.out.println("Część 7 ");
        ForumUser andrew = new ForumUser("Andrew", "Kowalski", 'm',
                23, "andrew@kakaka.pl", "Anrdrew23", 12, true);
        andrew.singIn();
        andrew.introduceUser();
        andrew.post();
        andrew.deleteUser();
    }
}
