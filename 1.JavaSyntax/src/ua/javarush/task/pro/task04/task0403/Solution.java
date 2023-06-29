package ua.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Підсумовування
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        boolean isEnter = false;

        while (!isEnter) {
            if (console.hasNextInt()) {
                sum += console.nextInt();
            } else if (console.next().equalsIgnoreCase("ENTER")) {
                isEnter = true;
            }
        }
        System.out.println(sum);
    }
}