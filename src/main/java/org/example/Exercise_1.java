package org.example;

public class Exercise_1 {

    public double AreaOfTriangleOne(double a, double h) {
        return (a * h) / 2;
    }

    public double AreaOfTriangleTwo(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(Math.abs(p * (p - a) * (p - b) * (p - c)));
    }

    public double AreaOfRectangle(double a, double b) {
        return a * b;
    }

    public double AreaOfSquare(double a) {
        return a * a;
    }

    public double AreaOfRhombusOne(double a, double h) {
        return a * h;
    }

    public double AreaOfRhombusTwo(double d1, double d2) {
        return (d1 * d2) / 2;
    }

}
