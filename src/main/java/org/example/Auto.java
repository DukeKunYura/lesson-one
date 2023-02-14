package org.example;

public class Auto {
    private final String brand;
    private final String body;
    private final String bodyNumber;

    public Auto(String brand, String body, String bodyNumber) {
        this.brand = brand;
        this.body = body;
        this.bodyNumber = bodyNumber;
    }

    public Auto(Auto origin) {
        this.brand = origin.brand;
        this.body = origin.body;
        this.bodyNumber = origin.bodyNumber;
    }


    public String toString() {
        return brand + " " + body + " " + bodyNumber;
    }

    public Auto withBodyNumber(String bodyNumber) {
        return new Auto(brand, body, bodyNumber);
    }

    public String getBrand() {
        return brand;
    }

    public String getBody() {
        return body;
    }

    public String getBodyNumber() {
        return bodyNumber;
    }
}