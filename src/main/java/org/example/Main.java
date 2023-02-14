package org.example;

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
                System.out.println(persons[i].toString());
            }
        }
    }
}