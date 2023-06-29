package ua.javarush.task.pro.task09.task0906;

/*
Двійковий конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десяткове число " + decimalNumber + " дорівнює двійковому числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двійкове число " + binaryNumber + " дорівнює десятковому числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        String binary = "";
        if (decimalNumber > 0) {
            while (decimalNumber > 0) {
                binary = (decimalNumber % 2) + binary;
                decimalNumber = decimalNumber / 2;
            }
        }
        return binary;
    }

    public static int toDecimal(String binaryNumber) {
        int decimal = 0;
        if (!"".equals(binaryNumber) && binaryNumber != null) {
            int pow;
            for (int index = 0; index < binaryNumber.length(); index++) {
                pow = binaryNumber.length() - index - 1;
                decimal = decimal + Integer.parseInt(binaryNumber.substring(index, index + 1)) * (int) Math.pow(2, pow);
            }
        }
        return decimal;
    }
}
