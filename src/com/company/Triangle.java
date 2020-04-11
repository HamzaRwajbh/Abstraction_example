package com.company;

public class Triangle extends Shape {

    private double base;
    private double height;

    public Triangle(final String shapeName, final double base, final double height) {
        super(shapeName);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}
