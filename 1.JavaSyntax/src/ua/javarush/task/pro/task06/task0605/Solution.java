package ua.javarush.task.pro.task06.task0605;

/* 
Правильний порядок
*/

public class Solution {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            int tmp = array[length - i - 1];
            array[length - i - 1] = array[i];
            array[i] = tmp;
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
