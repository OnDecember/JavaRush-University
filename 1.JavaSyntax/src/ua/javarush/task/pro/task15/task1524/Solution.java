package ua.javarush.task.pro.task15.task1524;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/* 
Переплутані байти
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in);
             FileInputStream in = new FileInputStream(scanner.nextLine());
             FileOutputStream out = new FileOutputStream(scanner.nextLine()))
        {
            byte[] buffer = new byte[in.available()];
            while (in.available() > 0) {
               in.read(buffer);
            }
            for (int i = 0; i < buffer.length; i += 2) {
                if (i != buffer.length - 1) {
                    out.write(buffer[i + 1]);
                }
                out.write(buffer[i]);
            }
        }
    }
}