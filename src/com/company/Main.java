package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("--------------------------Square---------------------------");
        Square square = new Square("square", 2);
        System.out.println(square.getArea());
        System.out.println(square.getShapeName());

        System.out.println("---------------------------Triangle-----------------------");
        Triangle triangle = new Triangle("Triangle", 4, 2);
        System.out.println(square.getArea());
        System.out.println(square.getShapeName());
    }
}
