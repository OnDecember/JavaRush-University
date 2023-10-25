package ua.javarush.task.jdk13.task43.task4312;

import java.util.Set;

/* 
Антихакер
*/

public class Solution {

    public static void main(String[] args) {
        hackTheUniverse();
        Universe.getInstance().getLaws().forEach(System.out::println);
    }

    public static void hackTheUniverse() {
        Set<String> laws = Universe.getInstance().getLaws();
        try {
            laws.removeAll(laws);
            laws.add("Все, що може піти не так, піде не так.");
            laws.add("Сусідня черга завжди рухається швидше.");
            laws.add("Робота заповнює час, відведений на неї.");
            laws.add("90% чого завгодно - нісенітниця.");
            laws.add("Де працює закон підлості, там відпочиває теорія ймовірності.");
        } catch (Exception e) {
            System.out.println("Всесвіт захищений краще, ніж ми думали...");
        }
    }
}
