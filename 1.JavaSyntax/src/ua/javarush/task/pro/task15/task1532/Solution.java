package ua.javarush.task.pro.task15.task1532;

import java.io.ByteArrayOutputStream;

/* 
Шифр
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(encrypt("abcdefghi"));
    }

    public static ByteArrayOutputStream encrypt(String message) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] bytes = message.getBytes();
        int length = bytes.length;
        for (int i = 0; i < (length + 1) / 2 ; i++) {
            outputStream.write(bytes[i]);
            if (i < (length) / 2) {
                outputStream.write(bytes[length - i - 1]);
            }
        }
        return outputStream;
    }
}