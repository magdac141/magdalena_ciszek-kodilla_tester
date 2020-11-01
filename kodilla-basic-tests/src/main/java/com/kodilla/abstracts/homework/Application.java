package com.kodilla.abstracts.homewok;

public class Application {

    public static void main(String[] args) {

        Shape square = new Square(3.5);
        System.out.println("Square with side 3.5 has area " + square.getSurface());
        System.out.println("Square with side 3.5 has circumference " + square.getCircumference());

        Shape triangle = new Triangle(8, 3, 4,4);
        System.out.println("Triangle with base 8, side 1 3, side 2 4, height 4 has area " + triangle.getSurface());
        System.out.println("Triangle with base 8, side 1 3, side 2 4, height 4 has circumference " + triangle.getCircumference());

        Shape circle = new Circle(4);
        System.out.println("Circle with radius 4 has area " + circle.getSurface());
        System.out.println("Circle with radius 4 has circumference " + circle.getCircumference());

    }
}