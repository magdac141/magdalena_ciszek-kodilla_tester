package com.kodilla.inheritance.homework;

public class OperatingSystem1 extends OperatingSystem {

    public OperatingSystem1(int yearOfIssue) {
        super(yearOfIssue);
        System.out.println("Year constructor");
    }

    @Override
    public void turnOn() {
        System.out.println("Turning system on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning system off...");
    }
}
