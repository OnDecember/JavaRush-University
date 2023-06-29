package ua.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Читання і перетворення рядків
*/

public class Solution {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String a = console.nextLine();
        String b = console.nextLine();
        String c = console.nextLine();
        
        System.out.println(c);
        System.out.println(b.toUpperCase());
        System.out.println(a.toLowerCase());
    }
}
