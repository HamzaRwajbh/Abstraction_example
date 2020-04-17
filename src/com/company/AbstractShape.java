package com.company;

public abstract class AbstractShape implements Shape {

    private String shapeName;

    public AbstractShape(final String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return shapeName;
    }
}
