package ua.javarush.task.jdk13.task41.task4120.games;

import java.util.Random;

public abstract class BoardGame {

    private int playersAmount;

    abstract protected void initialize();

    abstract protected void play();
    abstract protected void end();
    protected void printWinner() {
        System.out.println("Переміг гравець № " + (new Random().nextInt(playersAmount) + 1));
    }

    public final void start(int playersAmount) {
        setPlayersAmount(playersAmount);
        initialize();
        play();
        end();
        printWinner();
    }

    public void setPlayersAmount(int playersAmount) {
        this.playersAmount = playersAmount;
    }
}
