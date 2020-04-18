package com.company;

public class Square extends AbstractShape {

    private double base;

    public Square(final String shapeName, final double base) {
        super(shapeName);
        this.base = base;
    }

    @Override
    public double perimeter() {
        return 4 * base;
    }

    @Override
    public double area() {
        return Math.pow(base, 2);
    }
}
