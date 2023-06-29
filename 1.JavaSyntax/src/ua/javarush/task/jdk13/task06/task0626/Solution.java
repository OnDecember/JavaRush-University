package ua.javarush.task.jdk13.task06.task0626;

import java.util.Arrays;
import java.util.Scanner;

/* 
Перша база даних
*/

public class Solution {
    public static String[][] array = new String[][]{
            {"123", "Іванов", "Богдан"},
            {"1425", "Петрова", "Марина"},
            {"37", "Богдан", "Андрій"},
            {"98", "Богданова", "Марина"},
            {"6285", "Прутко", "Сергій"},
            {"8", "Клочкова", "Олена"},
            {"754", "Котов", "Іван"}};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].equals(s)) {
                    System.out.println(array[i][0] + " " + array[i][1] + " " + array[i][2]);
                }
            }
        }
    }
}
