package ua.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успішність студентів
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Valerchik", 15d);
        grades.put("Terminatore", 20d);
        grades.put("Terminatore700", 25d);
        grades.put("Terminatore7001", 24d);
        grades.put("Terminatore7002", 21d);
    }
}
