package ua.javarush.task.jdk13.task06.task0632;


/*
Піраміда
*/

import java.util.Scanner;

public class Solution {
    public static char[][] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        array = new char[height][height * 2 - 1];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = '#';
                if (j < height - i - 1 || j > height + i - 1) {
                    array[i][j] = ' ';
                }
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
