package ua.javarush.task.jdk13.task41.task4105;

import ua.javarush.task.jdk13.task41.task4105.alchemy_library.*;
import ua.javarush.task.jdk13.task41.task4105.facade.PotionConversionFacade;

import static ua.javarush.task.jdk13.task41.task4105.alchemy_library.Type.MANA;
import static ua.javarush.task.jdk13.task41.task4105.alchemy_library.Type.STAMINA;

/* 
Алхімічна бібліотека
*/

public class Solution {

    public static String potionName = "Minor Healing Potion";
    public static String type = "stamina";

    public static void main(String[] args) {
        PotionConversionFacade facade = new PotionConversionFacade();
        String result = facade.convertPotion(potionName, type);
        System.out.println(result);
    }
}
