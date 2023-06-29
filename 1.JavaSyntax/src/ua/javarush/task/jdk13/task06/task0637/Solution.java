package ua.javarush.task.jdk13.task06.task0637;

import java.io.IOException;
import java.util.Arrays;

/* 
Прямокутник
*/

public class Solution {
    public static char[][] array = new char[5][6];

    public static void main(String[] args) throws IOException {
        Arrays.fill(array[0], 'X');
        Arrays.fill(array[1], 'X');
        Arrays.fill(array[2], 'X');
        Arrays.fill(array[3], 'X');
        Arrays.fill(array[4], 'X');

        Arrays.fill(array[1], 1, array[1].length - 1, ' ');
        Arrays.fill(array[2], 1, array[1].length - 1, ' ');
        Arrays.fill(array[3], 1, array[1].length - 1, ' ');
    }
}
