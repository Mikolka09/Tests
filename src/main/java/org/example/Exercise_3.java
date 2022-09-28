package org.example;

import java.util.Arrays;
import java.util.Objects;

public class Exercise_3 {

    public boolean Palindrome(String str) {
        String[] arr = str.split(" ");
        int count;
        count = (int) Arrays.stream(arr).filter(x -> Objects.equals(x.toUpperCase(),
                new StringBuilder(x).reverse().toString().toUpperCase())).count();
        return count > 0;
    }

    public int CountVowels(String str) {
        int count = 0;
        char[] vowels = {'а', 'я', 'у', 'ю', 'о', 'е', 'ё', 'э', 'и', 'ы'};
        for (char vowel : vowels)
            for (char letter : str.toLowerCase().toCharArray())
                if (letter == vowel) count++;
        return count;
    }

    public int CountConsonants(String str) {
        int count = 0;
        char[] vowels = {'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п',
                'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ'};
        for (char vowel : vowels)
            for (char letter : str.toLowerCase().toCharArray())
                if (letter == vowel) count++;
        return count;
    }

    public int CountWord(String str, String word){
        int count = 0;
        String[] arr = str.split(" ");
        count = (int) Arrays.stream(arr).filter(x->Objects.equals(x, word)).count();
        return count;
    }
}
