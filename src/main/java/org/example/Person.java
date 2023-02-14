package org.example;

public class Person {
    private final String firstName;
    private final String lastName;
    private final String age;
    private final String job;
    private final String passportNumber;

    public Person(String firstName, String lastName, String age, String job, String passportNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.job = job;
        this.passportNumber = passportNumber;
    }

    public String toString() {
        return firstName + " " + lastName + " " + age + " " + job + " " + passportNumber;
    }

    public String getFirstName () {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public String getPassportNumber() {
        return passportNumber;
    }
}
