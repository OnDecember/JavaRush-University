package ua.javarush.task.jdk13.task12.task1220;

/* 
Клас Human та інтерфейси CanRun, CanSwim
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanSwim {
        void swim();
    }

    public interface CanRun {
        void run();
    }

    public abstract class Human implements CanSwim, CanRun {

    }
}
