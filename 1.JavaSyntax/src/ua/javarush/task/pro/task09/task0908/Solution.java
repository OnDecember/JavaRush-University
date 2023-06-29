package ua.javarush.task.pro.task09.task0908;

import java.util.regex.Pattern;

/* 
Двійково-шістнадцятковий конвертер
*/

public class Solution {
    public static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двійкове число " + binaryNumber + " дорівнює шістнадцятковому числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шістнадцяткове число " + hexNumber + " дорівнює двійковому числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        String hex = "";
        if (binaryNumber == null) {
            return hex;
        }
        int count;
        if ((count = binaryNumber.length() % 4) != 0) {
            for (int i = 0; i < 4 - count; i++) {
                binaryNumber = "0" + binaryNumber;
            }
        }
        for (int i = 0; i < binaryNumber.length(); i += 4) {
            int number = 0;
            if (binaryNumber.charAt(i) == '1') {
                number += 8;
            }
            if (binaryNumber.charAt(i + 1) == '1') {
                number += 4;
            }
            if (binaryNumber.charAt(i + 2) == '1') {
                number += 2;
            }
            if (binaryNumber.charAt(i + 3) == '1') {
                number += 1;
            }
            hex = hex + HEX.charAt(number);
        }

        return hex;
    }

    public static String toBinary(String hexNumber) {
        String binary = "";
        if (hexNumber != null) {
            for (int i = 0; i < hexNumber.length(); i++) {
                int number = HEX.indexOf(hexNumber.charAt(i));
                if (number == -1) {
                    return "";
                }
                switch (number) {
                    case 0: {
                        binary += "0000";
                        continue;
                    }
                    case 1: {
                        binary += "0001";
                        continue;
                    }
                    case 2: {
                        binary += "0010";
                        continue;
                    }
                    case 3: {
                        binary += "0011";
                        continue;
                    }
                    case 4: {
                        binary += "0100";
                        continue;
                    }
                    case 5: {
                        binary += "0101";
                        continue;
                    }
                    case 6: {
                        binary += "0110";
                        continue;
                    }
                    case 7: {
                        binary += "0111";
                        continue;
                    }
                    case 8: {
                        binary += "1000";
                        continue;
                    }
                    case 9: {
                        binary += "1001";
                        continue;
                    }
                    case 10: {
                        binary += "1010";
                        continue;
                    }
                    case 11: {
                        binary += "1011";
                        continue;
                    }
                    case 12: {
                        binary += "1100";
                        continue;
                    }
                    case 13: {
                        binary += "1101";
                        continue;
                    }
                    case 14: {
                        binary += "1110";
                        continue;
                    }
                    case 15: {
                        binary += "1111";
                    }
                }
            }
        }
        return binary;
    }
}
