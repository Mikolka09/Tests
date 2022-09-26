package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Exercise_1 ex= new Exercise_1();
        System.out.println("Плащадь треугольника вариант 1: "+ ex.AreaOfTriangleOne(10, 5));
        System.out.println("Плащадь треугольника вариант 2: "+ ex.AreaOfTriangleTwo(10, 5, 4));
        System.out.println("Плащадь прямоугольника: "+ ex.AreaOfRectangle(10, 5));
        System.out.println("Плащадь квадрата: "+ ex.AreaOfSquare(10));
        System.out.println("Плащадь ромба вариант 1: "+ ex.AreaOfRhombusOne(10, 5));
        System.out.println("Плащадь ромба вариант 2: "+ ex.AreaOfRhombusTwo(10, 5));

        System.out.println( "FINISH" );
    }
}
