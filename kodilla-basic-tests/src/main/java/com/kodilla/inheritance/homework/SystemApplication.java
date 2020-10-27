package com.kodilla.inheritance.homework;

public class SystemApplication {
    public static void main(String[] args) {

        OperatingSystem1 operatingSystem1 = new OperatingSystem1(1950);
        operatingSystem1.turnOn();

        OperatingSystem2 operatingSystem2 = new OperatingSystem2(1980);
        operatingSystem2.turnOff();

        System.out.println(operatingSystem2.getYearOfIssue());
    }

}