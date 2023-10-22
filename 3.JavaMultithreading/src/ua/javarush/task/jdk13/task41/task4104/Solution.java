package ua.javarush.task.jdk13.task41.task4104;

/* 
Фантастичні звірі
*/

import ua.javarush.task.jdk13.task41.task4104.creature.Cow;
import ua.javarush.task.jdk13.task41.task4104.move.Fly;
import ua.javarush.task.jdk13.task41.task4104.move.MoveLogic;
import ua.javarush.task.jdk13.task41.task4104.sound.Meow;
import ua.javarush.task.jdk13.task41.task4104.sound.SoundLogic;

public class Solution {

    public static void main(String[] args) {
        MoveLogic flying = new Fly();
        SoundLogic meow = new Meow();
        Cow cow = new Cow(flying, meow);
        cow.howDoIMove();
        cow.howDoISound();
        cow.giveMilk();

        SwimmingMeowingHuman human = new SwimmingMeowingHuman();
        human.move();
        human.sound();
        human.searchMeaningOfLife();
    }
}
