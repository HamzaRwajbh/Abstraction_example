package com.company;

public interface Shape {

    double perimeter();

    double area();

    default String getDetails() {
        return "the perimeter is " + perimeter() + " and the Area is " + area();
    }
}
