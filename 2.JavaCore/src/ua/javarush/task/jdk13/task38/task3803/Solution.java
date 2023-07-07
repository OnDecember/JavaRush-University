package ua.javarush.task.jdk13.task38.task3803;

/* 
Обробка анотацій
*/

import java.lang.annotation.Annotation;

public class Solution {
    public static void main(String[] args) {
        printFullyQualifiedNames(Solution.class);
        printFullyQualifiedNames(SomeTest.class);

        printValues(Solution.class);
        printValues(SomeTest.class);
    }

    public static <T> boolean printFullyQualifiedNames(Class<T> c) {
        for (Annotation annotation : c.getAnnotations()) {
            if (annotation instanceof PrepareMyTest ) {
                PrepareMyTest myAnnotation = (PrepareMyTest) annotation;
                for (String name : myAnnotation.fullyQualifiedNames()) {
                    System.out.println(name);
                }
                return true;
            }
        }
        return false;
    }

    public static <T> boolean printValues(Class<T> c) {
        for (Annotation annotation : c.getAnnotations()) {
            if (annotation instanceof PrepareMyTest) {
                PrepareMyTest prepareMyTest = (PrepareMyTest) annotation;
                for (Class<?> aClass : prepareMyTest.value()) {
                    System.out.println(aClass.getSimpleName());
                }
                return true;
            }
        }
        return false;
    }
}
