package ua.javarush.task.pro.task15.task1526;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in);
            FileReader reader = new FileReader(scanner.nextLine()))
        {
            while (reader.ready()) {
               char sumbol = (char) reader.read();
               if (sumbol != '.' && sumbol != ',' && sumbol != ' ') {
                   System.out.print(sumbol);
               }
            }
        }
    }
}