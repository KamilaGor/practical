package com.module1coma1;

import com.module1coma1.algorithm.ComplicatedAlgorithmRunner;
import com.module1coma1.animals.AnimalRecognizer;
import com.module1coma1.animals.Cat;
import com.module1coma1.animals.Dog;
import com.module1coma1.animals.Mouse;
import com.module1coma1.hash.Animals;
import com.module1coma1.hash.Person;
import com.module1coma1.hash.SampleObject;
import com.module1coma1.knight.DeadIslandQuest;
import com.module1coma1.knight.EliteKnightQuest;
import com.module1coma1.knight.Knight;
import com.module1coma1.people.Male;
import com.module1coma1.salary.FixedSalaryEmployee;
import com.module1coma1.salary.FixedSalaryEmployeeWithBonus;
import com.module1coma1.salary.HourlySalaryEmployee;
import com.module1coma1.salary.SalaryPayoutProcessor;
import com.module1coma1.transaction.BankTransaction;

public class Main {

    public static void main(String[] args) {

        // part1 interfejsy - wykrzysttanie
        System.out.println("part1: ");
        AnimalRecognizer recognizer = new AnimalRecognizer();
        String result = recognizer.recognize(new Dog());
        String result1 = recognizer.recognize(new Cat());
        String result2 = recognizer.recognize(new Mouse());
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println();

        // part2 interfejsy - wykrzysttanie
        System.out.println("part2: ");
        Knight knight = new Knight(new DeadIslandQuest());
        Knight knight1 = new Knight(new EliteKnightQuest());
        knight.informAboutMission();
        knight1.informAboutMission();
        System.out.println();

        // part3 -przykład klasy abstrakcyjnej
        System.out.println("part3: ");
        Male male = new Male("John");
        String name = male.getName();
        System.out.println(name);
        male.voice();
        System.out.println();

        // part4 -przykład klasy abstrakcyjnej
        System.out.println("part4: ");
        ComplicatedAlgorithmRunner runner = new ComplicatedAlgorithmRunner();
        runner.run();
        System.out.println();

        // part5 -przykład klasy abstrakcyjnej
        System.out.println("part5: ");
        BankTransaction atm = new BankTransaction();
        atm.run();
        System.out.println();

        // part6 -przykład klasy abstrakcyjnej
        System.out.println("part6: ");
        FixedSalaryEmployee employee = new FixedSalaryEmployee(2000.00);
        SalaryPayoutProcessor processor = new SalaryPayoutProcessor(employee);
        processor.processPayout();

        SalaryPayoutProcessor processor1 = new SalaryPayoutProcessor(new HourlySalaryEmployee(15, 10.00));
        processor1.processPayout();
        System.out.println();

        SalaryPayoutProcessor processor2 = new SalaryPayoutProcessor(new FixedSalaryEmployeeWithBonus(2000, true));
        processor2.processPayout();
        System.out.println();

        // part7 - użycie hashCode()
        System.out.println("part7: ");
        SampleObject object = new SampleObject();
        int result7 = object.hashCode();
        System.out.println(result7);
        System.out.println();

        // part8 - użycie hashCode()
        System.out.println("part8: ");
        Person john = new Person("John", "12");
        Person anthony = new Person("Anthony", "22");
        int result8 = john.hashCode();
        int result81= anthony.hashCode();
        System.out.println("Hashcode dla klasy person: " + result8 + " " + result81);
        Animals dog1 = new Animals("Misiek", 3);
        Animals cat1 = new Animals("Fiona", 1);
        int result82 = dog1.hashCode();
        int result83= cat1.hashCode();
        System.out.println("Hashcode dla klasy animal: " + result82 + " " + result83);
    }
}
