package ua.javarush.task.jdk13.task12.task1216;

/* 
Кішки не повинні бути абстрактними!
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {

        @Override
        public String getName() {
            return "Barsik";
        }

        @Override
        public Pet getChild() {
            return new Cat();
        }
    }

    public static class Dog extends Pet  {

        @Override
        public String getName() {
            return "Sharik";
        }

        @Override
        public Pet getChild() {
            return new Dog();
        }
    }

}
