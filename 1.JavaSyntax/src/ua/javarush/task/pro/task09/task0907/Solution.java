package ua.javarush.task.pro.task09.task0907;

/*
Шістнадцятковий конвертер
*/

import java.util.Calendar;

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десяткове число " + decimalNumber + " дорівнює шістнадцятковому числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шістнадцяткове число " + hexNumber + " дорівнює десятковому числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        String hex = "";
        if (decimalNumber > 0) {
            while (decimalNumber > 0) {
                hex = HEX.charAt(decimalNumber % 16) + hex;
                decimalNumber = decimalNumber / 16;
            }
        }
        return hex;
    }

    public static int toDecimal(String hexNumber) {
        int decimal = 0;
        if (!"".equals(hexNumber) && hexNumber != null) {
            int pow;
            for (int i = 0; i < hexNumber.length(); i++) {
                pow = hexNumber.length() - i - 1;
                decimal = decimal + HEX.indexOf(hexNumber.charAt(i)) * (int) Math.pow(16, pow);
            }
        }
        return decimal;
    }
}
