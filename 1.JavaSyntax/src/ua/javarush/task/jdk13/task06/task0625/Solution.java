package ua.javarush.task.jdk13.task06.task0625;

import java.util.Scanner;


public class Solution {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minSum = Integer.MAX_VALUE;


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            int sumRows = 0;
            int sumColumns = 0;
            for (int j = 0; j < array[i].length; j++) {
                sumRows += array[i][j];
                sumColumns += array[j][i];
            }
            if (minSum > sumRows) {
                minSum = sumRows;
            }
            if (minSum > sumColumns) {
                minSum = sumColumns;
            }
        }
        System.out.println(minSum);
    }
}
