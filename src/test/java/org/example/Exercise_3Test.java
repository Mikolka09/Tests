package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Exercise_3Test {
    String str;
    String word;

    @Before
    public void setUp() throws Exception {
        System.out.println("Before");
        this.str = "мама ела кашу с медом и ела конфеты";
        this.word = "ела";
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After");
    }

    @Test
    public void palindrome() {
        Exercise_3 ex3 = new Exercise_3();
        System.out.println("Palindrome");
        Assert.assertTrue("В строке присутствует Палиндром!", ex3.Palindrome(this.str));
    }

    @Test
    public void countVowels() {
        Exercise_3 ex3 = new Exercise_3();
        System.out.println("Count Vowels");
        int res = 14;
        Assert.assertEquals("Количество гласных: ", res, ex3.CountVowels(this.str));
    }

    @Test
    public void countConsonants() {
        Exercise_3 ex3 = new Exercise_3();
        System.out.println("Count Consonants");
        int res = 14;
        Assert.assertEquals("Количество согласных: ", res, ex3.CountConsonants(this.str));
    }

    @Test
    public void countWord() {
        Exercise_3 ex3 = new Exercise_3();
        System.out.println("Count Word");
        int res = 2;
        Assert.assertEquals("Количество вхождений слова: ", res, ex3.CountWord(this.str, this.word));
    }
}