package com;

public class Main {
    public static void main(String[] args) {
        Figure circle = new Circle(5);
        Figure rectangle = new Rectangle(4, 6);
        Figure triangle = new Triangle(3, 4, 5);

        figureInf(circle.getName(), circle);
        figureInf(rectangle.getName(), rectangle);
        figureInf(triangle.getName(), triangle);

        double area = circle.getArea();
        double areaInM2 = GeometryUtils.cm2ToM2(area);
        System.out.println("Площадь круга в м2: " + areaInM2);

        int cmp = GeometryUtils.compareAreas(circle, rectangle);
        if (cmp > 0) {
            System.out.println("Круг больше прямоугольника");
        } else if (cmp < 0) {
             System.out.println("Прямоугольник больше круга");
        } else {
            System.out.println("Площади равны");
        }
    }

    private static void figureInf(String name, Figure figure) {
        System.out.println(name);
        System.out.println("Площадь: " + figure.getArea());
        System.out.println("Периметр: " + figure.getPerimeter());
        System.out.println();
    }
}