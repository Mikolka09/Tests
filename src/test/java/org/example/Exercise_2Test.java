package org.example;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise_2Test {

    double grn;

    @Before
    public void setUp() throws Exception {
        System.out.println("Before");
        this.grn = 1000;
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After");
    }

    @Test
    public void changeUSD() {
        Exercise_2 ex2 = new Exercise_2();
        System.out.println("Change USD");
        String res = "27,07";
        Assert.assertEquals("Сумма в долларах будет равна: ", res, ex2.changeUSD(this.grn));
    }

    @Test
    public void changeEUR() {
        Exercise_2 ex2 = new Exercise_2();
        System.out.println("Change EUR");
        String res = "28,22";
        Assert.assertEquals("Сумма в евро будет равна: ", res, ex2.changeEUR(this.grn));
    }

    @Test
    public void changeGBR() {
        Exercise_2 ex2 = new Exercise_2();
        System.out.println("Change GBR");
        String res = "25,25";
        Assert.assertEquals("Сумма в фунтах будет равна: ", res, ex2.changeGBR(this.grn));
    }

    @Test
    public void changeYER() {
        Exercise_2 ex2 = new Exercise_2();
        System.out.println("Change YER");
        String res = "6666,67";
        Assert.assertEquals("Сумма в йенах будет равна: ", res, ex2.changeYER(this.grn));
    }
}