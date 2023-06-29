package ua.javarush.task.pro.task11.task1101;

/* 
Сонячна система — наш дім
*/

public class Solution {

    public static void main(String[] args) {

        System.out.println("Людство живе в Сонячній системі.");
        System.out.println(String.format("Її вік близько %d років.", SolarSystem.age));
        System.out.println(String.format("У Сонячній системі %d відомих планет.", SolarSystem.planetsCount));
        System.out.println(String.format("Так само, як і більшість зоряних систем, вона має %d зорю.", SolarSystem.starsCount));
        System.out.println(String.format("Зорю на ім'я %s.", SolarSystem.starName));
        System.out.println(String.format("Відстань до центра галактики становить %d світлових років.", SolarSystem.galacticCenterDistance));
        System.out.println("Кожен мешканець Сонячної системи має знати цю інформацію!");

    }
}
