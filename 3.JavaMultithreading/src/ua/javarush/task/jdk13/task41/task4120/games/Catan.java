package ua.javarush.task.jdk13.task41.task4120.games;

public class Catan extends BoardGame {
    @Override
    protected void initialize() {
        System.out.println("""
                ---------------------------------------------------------
                Підготовка до гри Колонізатори:
                    - Складаємо острів для колонізації;
                    - роздаємо гравцям фігурки поселень, міст та доріг;
                    - Розкладаємо колоди сировини та розвитку.""");
    }

    @Override
    protected void play() {
        System.out.println("Гравці колонізують острів, торгують ресурсами, крадуть ресурси, інтригують та вигадують різноманітні хитрощі...");
    }

    @Override
    protected void end() {
        System.out.println("Один із гравців набрав 10 переможних очок.");
    }
}
