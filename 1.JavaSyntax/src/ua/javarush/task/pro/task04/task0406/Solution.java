package ua.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показуємо, що отримуємо
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while (true) {
            String s = console.nextLine();
            if (s.equals("enough"))
                break;
            System.out.println(s);
        }

    }
}