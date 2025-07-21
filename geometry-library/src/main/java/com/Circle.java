package com;

public class Circle implements Figure {
    private final double radius;
    private final double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return pi * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * pi * radius;
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}
