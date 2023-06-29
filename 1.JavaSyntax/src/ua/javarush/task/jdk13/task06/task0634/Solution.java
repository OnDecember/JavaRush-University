package ua.javarush.task.jdk13.task06.task0634;

import java.util.Scanner;

/* 
Шахівниця
*/

public class Solution {
    public static final char BLACK = '#';
    public static final char WHITE = ' ';

    public static char[][] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        array = new char[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    array[i][j] = BLACK;
                } else {
                    array[i][j] = WHITE;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
