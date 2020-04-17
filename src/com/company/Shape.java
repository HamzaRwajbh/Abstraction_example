package com.company;

public interface Shape {

    double perimeter();

    double getArea();

    default void print() {
        System.out.println("the perimeter is " + perimeter() + " and the Area is " + getArea());
    }
}
