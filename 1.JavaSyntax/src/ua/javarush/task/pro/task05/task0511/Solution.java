package ua.javarush.task.pro.task05.task0511;

import java.util.Arrays;
import java.util.Scanner;

/* 
Створюємо двовимірний масив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();

        multiArray = new int[height][];
        for (int i = 0; i < height; i++) {
            int width = scanner.nextInt();
            multiArray[i] = new int[width];
        }
    }
}
