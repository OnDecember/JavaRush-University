package ua.javarush.task.pro.task15.task1516;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файл чи директорія
*/

public class Solution {

    private static final String THIS_IS_FILE = " - це файл";
    private static final String THIS_IS_DIR = " - це директорія";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String path = scanner.nextLine();
            if (Files.isRegularFile(Path.of(path))) {
                System.out.println(path + THIS_IS_FILE);
            } else if (Files.isDirectory(Path.of(path))) {
                System.out.println(path + THIS_IS_DIR);
            } else break;
        }
    }
}

