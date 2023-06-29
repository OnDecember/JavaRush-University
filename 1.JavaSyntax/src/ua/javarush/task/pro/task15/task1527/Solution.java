package ua.javarush.task.pro.task15.task1527;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Пропускаємо не всіх
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in);
             FileReader fileReader = new FileReader(scanner.nextLine());
             BufferedReader reader = new BufferedReader(fileReader))
        {
            int number = 0;
            while (reader.ready()) {
                String string = reader.readLine();
                if (number % 2 == 0) {
                    System.out.println(string);
                }
                number++;
            }
        }
    }
}