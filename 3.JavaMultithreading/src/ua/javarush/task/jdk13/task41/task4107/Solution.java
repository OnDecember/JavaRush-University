package ua.javarush.task.jdk13.task41.task4107;

import ua.javarush.task.jdk13.task41.task4107.factory.DotNetCourse;
import ua.javarush.task.jdk13.task41.task4107.factory.JavaRush;
import ua.javarush.task.jdk13.task41.task4107.factory.KotlinCourse;
import ua.javarush.task.jdk13.task41.task4107.factory.ProgrammingCourse;

/*
Кузня кадрів
*/

public class Solution {

    private static ProgrammingCourse course;

    public static void main(String[] args) {
        choose("web");
        startLearningProcess();
    }

    static void choose(String direction) {
        if (direction.equals("web")) {
            course = new JavaRush();
        } else if (direction.equals("android")) {
            course = new KotlinCourse();
        } else {
            course = new DotNetCourse();
        }
    }

    static void startLearningProcess() {
        course.educateStudent();
    }
}
