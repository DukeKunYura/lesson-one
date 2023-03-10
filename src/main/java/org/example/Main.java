package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Объявление массива (без new = сахар)
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

        //Объявление массива классическое
        Auto[] cars = new Auto[3];
        cars[0] = new Auto("Ford", "hatch", "757575");
        cars[1] = new Auto("Reno", "sedan", "535353");
        cars[2] = new Auto("Toyota", "sedan", "090909");

        System.out.println(cars[1]);
        cars[1] = cars[1].withBodyNumber("404040");
        System.out.println(cars[1]);

        //Объявление List
        List<Auto> autoList = new ArrayList<>();

        autoList.add(cars[0]);
        autoList.add(cars[1]);
        autoList.add(cars[2]);

        System.out.println(autoList.get(0));
        autoList.set(0, autoList.get(2));
        System.out.println(autoList.get(0));

        //Объявление Map
        Map<String, Auto> autoMap = new HashMap<>();

        autoMap.put("757575", new Auto("Ford", "hatch", "757575"));
        autoMap.put(cars[1].getBodyNumber(), cars[1]);
        autoMap.put(cars[2].getBodyNumber(), cars[2]);

        System.out.println(autoMap.get("757575"));

        //Получение коллекции из Map
        Collection<Auto> values = autoMap.values();
        for (Auto auto : values) {
            System.out.println("----");
            System.out.println(auto);
            System.out.println("----");
        }

        //Получение Set ключей из Map
        Set<String> keySet = autoMap.keySet();

        System.out.println(keySet);

        //Получение Set ключей и содержимого из Map
        Set<Entry<String, Auto>> entrySet = autoMap.entrySet();
        for (Entry<String, Auto> entry : entrySet) {
            System.out.println(entry);
        }
    }
}