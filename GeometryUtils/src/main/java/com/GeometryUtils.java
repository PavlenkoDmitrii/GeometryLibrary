package com;

public class GeometryUtils {
    public static double cm2ToM2(double areaCm2) {
        return areaCm2 / 10000;
    }

    public static int compareAreas(Figure s1, Figure s2) {
        return Double.compare(s1.getArea(), s2.getArea());
    }
}
