package ua.javarush.task.pro.task13.task1321;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getTranslationForDayOfWeek("Вівторок"));
        System.out.println(getTranslationForDayOfWeek("П'ятниця"));
        System.out.println(getTranslationForDayOfWeek("Нічогонеділя"));
    }

    public static String getTranslationForDayOfWeek(String ua) {
        String en;
        if ("понеділок".equals(ua)) {
            en = "Monday";
        } else if ("вівторок".equals(ua)) {
            en = "Tuesday";
        } else if ("середа".equals(ua)) {
            en = "Wednesday";
        } else if ("четвер".equals(ua)) {
            en = "Thursday";
        } else if ("п'ятниця".equals(ua)) {
            en = "Friday";
        } else if ("субота".equals(ua)) {
            en = "Saturday";
        } else if ("неділя".equals(ua)) {
            en = "Sunday";
        } else {
            en = "Неприпустимий день тижня";
        }
        return en;
    }
}
