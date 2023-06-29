package ua.javarush.task.pro.task12.task1206;

/* 
Аналіз рядків
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Гадаю, це буде нова фіча." +
                "Тільки нікому не кажіть, що вона виникла випадково.";

        System.out.println("Кількість цифр у рядку : " + countDigits(string));
        System.out.println("Кількість літер у рядку : " + countLetters(string));
        System.out.println("Кількість пробілів у рядку : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int count = 0;
        char[] chars = string.toCharArray();
        for (char aChar : chars) {
            if (Character.isDigit(aChar)) {
                count++;
            }
        }
        return count;
    }

    public static int countLetters(String string) {
        int count = 0;
        char[] chars = string.toCharArray();
        for (char aChar : chars) {
            if (Character.isLetter(aChar)) {
                count++;
            }
        }
        return count;
    }

    public static int countSpaces(String string) {
        int count = 0;
        char[] chars = string.toCharArray();
        for (char aChar : chars) {
            if (Character.isSpaceChar(aChar)) {
                count++;
            }
        }
        return count;
    }
}
