package ua.javarush.task.jdk13.task12.task1209;

/* 
Визначимося з тваринами
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        String animal = "Невідома тварина";
        if (o instanceof Cow) {
            animal = "Корова";
        } else if (o instanceof Dog) {
            animal = "Собака";
        } else if (o instanceof Whale) {
            animal = "Кит";
        }
        return animal;
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
