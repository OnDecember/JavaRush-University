package ua.javarush.task.jdk13.task15.task1510;

/* 
Статики й винятки
*/

public class Solution {
    public static int A = 0;

    static {
        A = 0/0;
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}
