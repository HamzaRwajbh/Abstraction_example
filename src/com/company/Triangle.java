package com.company;

public class Triangle extends AbstractShape {

    private double a;
    private double b;
    private double base;
    private double height;

    public Triangle(final String shapeName, final double a, final double b, final double base, final double height) {
        super(shapeName);
        this.a = a;
        this.b = b;
        this.base = base;
        this.height = height;
    }

    @Override
    public double perimeter() {
        return a + b + base;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}
