package ua.javarush.task.jdk13.task41.task4120;

import ua.javarush.task.jdk13.task41.task4120.games.Catan;
import ua.javarush.task.jdk13.task41.task4120.games.DiceForge;
import ua.javarush.task.jdk13.task41.task4120.games.WelcomeTo;

/* 
Гра як життя
*/

public class Solution {

    public static void main(String[] args) {
        new Catan().start(4);
        new DiceForge().start(2);
        new WelcomeTo().start(10);
    }
}
