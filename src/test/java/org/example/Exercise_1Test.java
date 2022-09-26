package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class Exercise_1Test {

    double a;
    double b;
    double c;
    double h;
    double d1;
    double d2;

    @Before
    public void setUp() throws Exception {
        System.out.println("Before");
        a = 10;
        b = 5;
        c = 4;
        h = 5;
        d1 = 10;
        d2 = 5;

    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After");
    }

    @Test
    public void areaOfTriangleOne() {
        Exercise_1 ex = new Exercise_1();
        System.out.println("Area Of Triangle One");
        double res = 25;
        Assert.assertEquals("Плащадь треугольника вариант 1: ", res, ex.AreaOfTriangleOne(a, b), 0.001);
    }

    @Test
    public void areaOfTriangleTwo() {
        Exercise_1 ex = new Exercise_1();
        System.out.println("Area Of Triangle Two");
    }

    @Test
    public void areaOfRectangle() {
        Exercise_1 ex = new Exercise_1();
    }

    @Test
    public void areaOfSquare() {
        Exercise_1 ex = new Exercise_1();
    }

    @Test
    public void areaOfRhombusOne() {
        Exercise_1 ex = new Exercise_1();
    }

    @Test
    public void areaOfRhombusTwo() {
        Exercise_1 ex = new Exercise_1();
    }
}