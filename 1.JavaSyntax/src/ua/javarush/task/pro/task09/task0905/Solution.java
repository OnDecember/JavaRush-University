package ua.javarush.task.pro.task09.task0905;

/*
Вісімковий конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десяткове число " + decimalNumber + " дорівнює вісімковому числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Вісімкове число " + octalNumber + " дорівнює десятковому числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        int octal = 0;
        int n = 0;
        while (decimalNumber > 0) {
            octal = octal + (decimalNumber % 8) * (int) Math.pow(10, n);
            decimalNumber = decimalNumber / 8;
            n++;
        }
        return octal;
    }

    public static int toDecimal(int octalNumber) {
        int decimal = 0;
        int n = 0;
        while (octalNumber > 0) {
            decimal = decimal + (octalNumber % 10) * (int) Math.pow(8, n);
            octalNumber = octalNumber / 10;
            n++;
        }
        return decimal;
    }
}
