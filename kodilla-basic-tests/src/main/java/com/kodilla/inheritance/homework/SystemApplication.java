package com.kodilla.inheritance.homework;

public class SystemApplication {
    public static void main(String[] args) {

        Windows7 windows7 = new Windows7(1950);
        windows7.turnOn();

        Windows10 windows10 = new Windows10(1980);
        windows10.turnOff();

        System.out.println(windows10.getYearOfIssue());
    }

}