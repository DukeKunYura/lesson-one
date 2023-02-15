package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Andrey", "Kovalev", "45", "locksmith", "3356 909090"),
                new Person("Ivan", "Popov", "33", "doctor", "3345 909089"),
                new Person("Timur", "Privetov", "37", "student", "3367 898980"),
        };

        for (int i = 0; i < persons.length; i++) {
            String age = persons[i].getAge();
            if (age.equals("33")) {
                System.out.println(persons[i]);
            }
        }

        Auto[] cars = {
                new Auto("Ford", "hatch", "757575"),
                new Auto("Reno", "sedan", "535353"),
                new Auto("Toyota", "sedan", "090909"),
        };

        System.out.println(cars[1]);
        cars[1] = cars[1].withBodyNumber("404040");
        System.out.println(cars[1]);

        List<Auto> autoList = new ArrayList<>();

        autoList.add(cars[0]);
        autoList.add(cars[1]);
        autoList.add(cars[2]);

        System.out.println(autoList.get(0));
        autoList.set(0, autoList.get(2));
        System.out.println(autoList.get(0));

    }
}