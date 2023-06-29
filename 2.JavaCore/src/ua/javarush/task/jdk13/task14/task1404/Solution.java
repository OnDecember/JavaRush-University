package ua.javarush.task.jdk13.task14.task1404;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Коти
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        String answer;
        while (true) {
            answer = console.nextLine();
            if (answer.equals("")) break;
            Cat cat = CatFactory.getCatByKey(answer);
            System.out.println(cat);
        }
    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat;
            switch (key) {
                case "vaska":
                    cat = new MaleCat("Василь");
                    break;
                case "murka":
                    cat = new FemaleCat("Мурочка");
                    break;
                case "kiska":
                    cat = new FemaleCat("Кицюнька");
                    break;
                default:
                    cat = new Cat(key);
                    break;
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "Я вуличний кіт " + getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - солідний кошак на ім'я " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - мила кішечка на ім'я " + getName();
        }
    }
}
