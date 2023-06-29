package ua.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        if (number <= 0) {
            return;
        }

        int[] numbers = new int[number];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = console.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (number % 2 == 0) {
                System.out.println(numbers[numbers.length - 1 - i]);
            } else {
                System.out.println(numbers[i]);
            }
        }
    }
}
