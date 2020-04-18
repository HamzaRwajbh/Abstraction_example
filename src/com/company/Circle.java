package com.company;

public class Circle extends AbstractShape {

    private double radios;

    public Circle(final String shapeName, final double radios) {
        super(shapeName);
        this.radios = radios;
    }

    @Override
    public double perimeter() {
        return radios * Math.PI;
    }

    @Override
    public double area() {
        return Math.pow(radios, 2) * Math.PI * 2;
    }
}
