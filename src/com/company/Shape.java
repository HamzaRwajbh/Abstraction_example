package com.company;

public abstract class Shape {

    private String shapeName;

    public Shape(final String shapeName) {
        this.shapeName = shapeName;
    }

    public abstract double getArea();

    public String getShapeName() {
        return shapeName;
    }
}
