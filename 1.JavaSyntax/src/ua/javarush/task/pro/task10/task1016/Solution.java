package ua.javarush.task.pro.task10.task1016;

/* 
Прогноз погоди
*/

public class Solution {

    public static void showWeather(City city) {
        System.out.printf("У місті %s сьогодні температура повітря %d", city.getName(), city.getTemperature());
    }

    public static void main(String[] args) {
        City city = new City("Дубай", 40);
        showWeather(city);
    }
}
