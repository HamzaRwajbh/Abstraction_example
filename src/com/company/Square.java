package com.company;

public class Square extends Shape {

    private double base;

    public Square(final String shapeName, final double base) {
        super(shapeName);
        this.base = base;
    }

    @Override
    public double getArea() {
        return Math.pow(base, 2);
    }
}
