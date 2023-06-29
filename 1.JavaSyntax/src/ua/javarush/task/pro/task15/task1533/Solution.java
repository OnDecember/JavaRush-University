package ua.javarush.task.pro.task15.task1533;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* 
Заміна потоку
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        writeData("Justinian", "Justinian@mega.city.one", 41, 391);
    }

    public static ByteArrayOutputStream writeData(String name, String email, int level, int rating) throws IOException {
        try (ByteArrayOutputStream fos = new ByteArrayOutputStream()) {
            fos.write(("Ім'я: " + name + "\n").getBytes(StandardCharsets.UTF_8));
            fos.write(("Пошта: " + email + "\n").getBytes(StandardCharsets.UTF_8));
            fos.write(("Рівень: " + level + "\n").getBytes(StandardCharsets.UTF_8));
            fos.write(("Рейтинг: " + rating + "\n").getBytes(StandardCharsets.UTF_8));
            return fos;
        }
    }
}
