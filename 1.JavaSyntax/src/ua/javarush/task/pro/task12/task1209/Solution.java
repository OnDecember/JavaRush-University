package ua.javarush.task.pro.task12.task1209;

import java.util.ArrayList;

/* 
Бухгалтерія
*/

public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвінно");
        waitingEmployees.add("Гунігерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Ніфрод");
        waitingEmployees.add("Альбіуф");
        waitingEmployees.add("Іногрім");
        waitingEmployees.add("Фріле");
    }

    public static void main(String[] args) {
        initEmployees();
    }

    public static void paySalary(String name) {
        if (waitingEmployees.contains(name) && !alreadyGotSalaryEmployees.contains(name)) {
            alreadyGotSalaryEmployees.add(name);
            int index = waitingEmployees.indexOf(name);
            waitingEmployees.set(index, null);
        }
    }
}
