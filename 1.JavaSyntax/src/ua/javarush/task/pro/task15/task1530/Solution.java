package ua.javarush.task.pro.task15.task1530;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Байти у символи
*/

public class Solution {

    public static void main(String[] args) {
        ByteArrayInputStream stream = new ByteArrayInputStream("O sole, o sole mio!\nSta 'nfronte a te!\n Sta 'nfronte a te!".getBytes(StandardCharsets.UTF_8));
        System.out.println(new String(bytesToChars(stream, 38)));
    }

    public static char[] bytesToChars(ByteArrayInputStream stream, int n) {
        char[] chars;
        if (stream.available() < n) {
            chars = new char[stream.available()];
        } else {
            chars = new char[n];
        }
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) stream.read();
        }
        return chars;
    }
}
