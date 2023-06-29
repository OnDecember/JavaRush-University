package ua.javarush.task.jdk13.task12.task1218;

/* 
їсти, літати й рухатися
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
         void fly();
    }

    public interface CanMove {
         void move();
    }

    public interface CanEat {
         void eat();
    }

    public class Dog implements CanMove, CanEat {
        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }

    public class Duck implements CanMove, CanEat, CanFly {
        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }

        @Override
        public void fly() {

        }
    }

    public class Car implements CanMove {
        @Override
        public void move() {

        }
    }

    public class Airplane implements CanMove, CanFly {
        @Override
        public void fly() {

        }

        @Override
        public void move() {

        }
    }
}
