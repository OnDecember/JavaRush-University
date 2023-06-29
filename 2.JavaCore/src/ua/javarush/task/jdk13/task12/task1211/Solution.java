package ua.javarush.task.jdk13.task12.task1211;

/* 
Int та Integer
*/

public class Solution {
    public static void main(String[] args) {
        print(1);
        print(Integer.valueOf(1));
    }

    public static void print(int n) {
        System.out.println(n);
    }

    public static void print(Integer n) {
        System.out.println(n);
    }
}
