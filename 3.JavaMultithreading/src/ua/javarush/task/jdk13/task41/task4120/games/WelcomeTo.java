package ua.javarush.task.jdk13.task41.task4120.games;

public class WelcomeTo extends BoardGame {
    @Override
    protected void initialize() {
        System.out.println("""
                -----------------------------------------------------
                Підготовка до гри Паперові квартали:
                    - роздаємо гравцям ігрові поля та кулькові ручки;
                    - випадковим чином вибираємо три плани забудови;
                    - готуємо три стоси карт будівництва.""");
    }

    @Override
    protected void play() {
        System.out.println("Гравці будують житлові квартали з парками та басейнами, наймають торгових агентів та заробітчан.");
    }

    @Override
    protected void end() {
        System.out.println("Один із гравців виконав усі три плани забудови.");
    }
}
