package com.module1;

import com.module1.atms.ATM;
import com.module1.atms.ATMimpl;
import com.module1.shapes.Circle;
import com.module1.shapes.ShapeDrawer;
import com.module1.shapes.Triangle;
import com.module1.telephones.Mobile;
import com.module1.telephones.Telephone;
import com.module1.users.PersonValidator;
import com.module1.users.UserValidator;

public class Main {

    public static void main(String[] args) {
        //part1 podejście obiektowe
        System.out.println("Part1");
        System.out.println("Starting...");
        int age = 16;
        char sex = 'm';
        UserValidator user = new UserValidator();
        boolean isHigherThanFifteen = user.validateAge(age);
        if(isHigherThanFifteen) {
            user.validateSex(sex);
        }
        System.out.println("End of program.");
        System.out.println();

        //part2 podjeście obiektowe
        System.out.println("Part2");
//        PersonValidator adam = new PersonValidator("Adam", 23, 178.00);
//        String adamName = adam.getName();
//        double adamAge = adam.getAge();
//        double adamHeight = adam.getHeigth();
        PersonValidator adam = new PersonValidator();
        String name = "Adam";
        double age1 = 32;
        double height = 178;
        if(adam.validateName(name)) {
            adam.validateAgeAndHeight(age1, height);
        }
        System.out.println();

        //part3 interfejsy - zestaw wymagań, które stawiamy klasie odnośnie jej wymagań
        System.out.println("Part3");
        ShapeDrawer shapeDrawer = new ShapeDrawer(new Circle());
        shapeDrawer.process();
        ShapeDrawer shapeDrawer1 = new ShapeDrawer(new Triangle());
        shapeDrawer1.process();
        System.out.println();

        //part4 interfejsy - met. DOMYSLNA I STATYCZNA - sposób wywołania różnice !!
        System.out.println("Part4");
        Mobile mobile = new Mobile();
        mobile.callTo("Antek"); //zwykła metoda - wymaga nadpisania w klasie implementującej, wywołanie na obiekcie kl. implementującej
        mobile.callToMom(); // domyślna - nie wymaga nadpisania, wywołanie na obiekcie kl. implementującej
        Telephone.getMyNumber();//statyczna - nie nadpisuje się, wywołuje na interfejsie (nie da się z niego zrobić obiektu)
        System.out.println();

        //part5 interfejsy - met. DOMYSLNA I STATYCZNA - sposób wywołania różnice !!
        System.out.println("Part5");
        ATMimpl atm = new ATMimpl();
        boolean connection = true;
        atm.connectWithBank(connection);
        double deposit = 100;
        atm.payIn(deposit);
        double payoff = 200;
        atm.takeOut(payoff);
        ATM.endConnection();
    }
}
