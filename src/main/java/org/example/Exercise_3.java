package org.example;

import java.util.Arrays;
import java.util.Objects;

public class Exercise_3 {

    public boolean Palindrome(String str) {
        String[] arr = str.split(" ");
        int count = 0;
        count = (int) Arrays.stream(arr).filter(x -> Objects.equals(x.toUpperCase(),
                new StringBuilder(x).reverse().toString().toUpperCase())).count();
        return count > 0;
    }

    public int CountPlus(String str) {
        int count = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (char vowel : vowels)
            for (char letter : str.toLowerCase().toCharArray())
                if (letter == vowel) count++;
        System.out.println("Number of vowels in the given sentence is " + count);
        return count;
    }
}
