package ua.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Друге мінімальне число серед уведених
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int firstMin = console.nextInt();
        int secondMin = console.nextInt();
        if (secondMin < firstMin) {
            int tmp = firstMin;
            firstMin = secondMin;
            secondMin = tmp;
        }
        while (console.hasNextInt()) {
            int x = console.nextInt();
            if (x < firstMin) {
                secondMin = firstMin;
                firstMin = x;
            } else if (x > firstMin && x < secondMin) {
                secondMin = x;
            }
        }
        System.out.println(secondMin);
    }
}