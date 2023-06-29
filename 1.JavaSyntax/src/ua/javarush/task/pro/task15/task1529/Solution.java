package ua.javarush.task.pro.task15.task1529;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

/* 
Пишемо символи у файл
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             Writer output = new FileWriter(scanner.nextLine())) {
            char[] chars = new char[]{'j', 'a', 'v', 'a'};
            for (char aChar : chars) {
                output.write((byte)aChar);
            }
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}