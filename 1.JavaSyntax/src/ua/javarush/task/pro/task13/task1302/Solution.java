package ua.javarush.task.pro.task13.task1302;

import java.util.Arrays;
import java.util.HashSet;

import static java.util.Arrays.asList;

/* 
Перевірка наявності
*/

public class Solution {
    public static HashSet<String> words = new HashSet<>(asList("Якби мене попросили вибрати мову взамін на Java, я б не вибирав".split(" ")));

    public static void checkWords(String word) {
        if (words.contains(word)) {
            System.out.printf("Слово %s є в множині\n", word);
        } else {
            System.out.printf("Слова %s немає в множині\n", word);
        }
    }

    public static void main(String[] args) {
        checkWords("JavaScript");
        checkWords("Java");
    }
}
