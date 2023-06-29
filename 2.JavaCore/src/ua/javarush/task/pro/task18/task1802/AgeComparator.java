package ua.javarush.task.pro.task18.task1802;

import java.util.Comparator;

/* 
Сортування за віком
*/

public class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s2.getAge() - s1.getAge();
    }
}
