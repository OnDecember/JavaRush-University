package ua.javarush.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Трикутник
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "трикутник існує";
    private static final String TRIANGLE_NOT_EXISTS = "трикутник не існує";

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();

        if (a + b <= c) {
            System.out.println(TRIANGLE_NOT_EXISTS);
        } else if (a + c <= b) {
            System.out.println(TRIANGLE_NOT_EXISTS);
        } else if (b + c <= a) {
            System.out.println(TRIANGLE_NOT_EXISTS);
        } else {
            System.out.println(TRIANGLE_EXISTS);
        }
    }
}
