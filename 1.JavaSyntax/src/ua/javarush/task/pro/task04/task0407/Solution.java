package ua.javarush.task.pro.task04.task0407;

/* 
Сума чисел, не кратних 3
*/

public class Solution {
    public static void main(String[] args) {
        int sum = 0;
        int number = 1;

        while (number <= 100) {
            if (number % 3 == 0) {
                number++;
                continue;
            }
            sum += number;
            number++;
        }
        System.out.println(sum);
    }
}