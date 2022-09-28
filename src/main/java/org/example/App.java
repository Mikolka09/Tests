package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Задание 1
        /*Exercise_1 ex= new Exercise_1();
        System.out.println("Плащадь треугольника вариант 1: "+ ex.AreaOfTriangleOne(10, 5));
        System.out.println("Плащадь треугольника вариант 2: "+ ex.AreaOfTriangleTwo(10, 5, 4));
        System.out.println("Плащадь прямоугольника: "+ ex.AreaOfRectangle(10, 5));
        System.out.println("Плащадь квадрата: "+ ex.AreaOfSquare(10));
        System.out.println("Плащадь ромба вариант 1: "+ ex.AreaOfRhombusOne(10, 5));
        System.out.println("Плащадь ромба вариант 2: "+ ex.AreaOfRhombusTwo(10, 5));*/

        //Задание 2
        /*Exercise_2 ex2 = new Exercise_2();
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("\tОбменный калькулятор валют");
            System.out.print("Введите сумму в гриавнах: ");
            double grn = Double.parseDouble(scan.nextLine());
            while (true){
                System.out.println("\nВ какую валюту пересчитать:\n1. Доллар - USD\n2. Евро - EUR" +
                        "\n3. Фунт - GBR\n4. Йена - YER\n5. Выход");
                System.out.print("\nВаш выбор: ");
                int var = Integer.parseInt(scan.nextLine());
                switch (var){
                    case 1:
                        System.out.printf("\nСумма в долларах будет равна - %s", ex2.changeUSD(grn));
                        Thread.sleep(2000);
                        break;
                    case 2:
                        System.out.printf("\nСумма в евро будет равна - %s", ex2.changeEUR(grn));
                        Thread.sleep(2000);
                        break;
                    case 3:
                        System.out.printf("\nСумма в фунтах будет равна - %s", ex2.changeGBR(grn));
                        Thread.sleep(2000);
                        break;
                    case 4:
                        System.out.printf("\nСумма в йенах будет равна - %s", ex2.changeYER(grn));
                        Thread.sleep(2000);
                        break;
                    default:
                        System.exit(0);
                }
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }*/

        //Задание 3
        Exercise_3 ex3 = new Exercise_3();
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку (слова в строке через пробел): ");
        String st = scan.nextLine();
        System.out.println(ex3.Palindrome(st)? "В строке присутствует Палиндром!":
                "В строке не присутствует Палиндром!");
        System.out.println("Количество гласных: "+ ex3.CountVowels(st));
        System.out.println("Количество согласных: "+ ex3.CountConsonants(st));
        System.out.print("Введите слово: ");
        String word = scan.nextLine();
        System.out.printf("Количество вхождений слова '%s' в строке: %s", word, ex3.CountWord(st, word));


        System.out.println( "\nFINISH" );
    }
}
