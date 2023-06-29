package com.javarush.games.game2048;

import com.javarush.engine.cell.*;

public class Game2048 extends Game {
    private static final int SIDE = 4;
    private int[][] gameField = new int[SIDE][SIDE];
    private boolean isGameStopped = false;
    private int score = 0;

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
        drawScene();
    }

    private void createGame() {
        gameField = new int[SIDE][SIDE];
        score = 0;
        setScore(score);
        createNewNumber();
        createNewNumber();
    }

    private void drawScene() {
        for (int y = 0; y < gameField.length; y++) {
            for (int x = 0; x < gameField[y].length; x++) {
                setCellColoredNumber(x, y, gameField[y][x]);
            }
        }
    }

    private void createNewNumber() {
        int max = getMaxTileValue();
        if (max >= 2048) {
            win();
        }
        int x;
        int y;
        do {
            x = getRandomNumber(SIDE);
            y = getRandomNumber(SIDE);
        } while (gameField[y][x] != 0);
        int chance = getRandomNumber(10);
        if (chance == 0) gameField[y][x] = 4;
        else gameField[y][x] = 2;
    }

    private Color getColorByValue(int value) {
        switch (value) {
            case 2: {
                return Color.LIGHTPINK;
            }
            case 4: {
                return Color.BLUEVIOLET;
            }
            case 8: {
                return Color.BLUE;
            }
            case 16: {
                return Color.LIGHTBLUE;
            }
            case 32: {
                return Color.FORESTGREEN;
            }
            case 64: {
                return Color.LIGHTGREEN;
            }
            case 128: {
                return Color.ORANGE;
            }
            case 256: {
                return Color.INDIANRED;
            }
            case 512: {
                return Color.ORANGERED;
            }
            case 1024: {
                return Color.PINK;
            }
            case 2048: {
                return Color.PURPLE;
            }
            default: {
                return Color.WHITE;
            }
        }
    }

    private void setCellColoredNumber(int x, int y, int value) {
        Color color = getColorByValue(value);
        if (value != 0) {
            setCellValueEx(x, y, color, String.valueOf(value));
        } else {
            setCellValueEx(x, y, color, "");
        }
    }

    private boolean compressRow(int[] row) {
        boolean isChanged = false;
        for (int i = 0; i < SIDE; i++) {
            if (row[i] != 0) {
                for (int j = 0; j < row.length; j++) {
                    if (row[j] == 0 && j < i) {
                        row[j] = row[i];
                        row[i] = 0;
                        isChanged = true;
                    }
                }
            }
        }
        return isChanged;
    }

    private boolean mergeRow(int[] row) {
        boolean isMerged = false;
        for (int i = 1; i < SIDE; i++) {
            if (row[i] == row[i - 1] && row[i] != 0) {
                row[i - 1] *= 2;
                row[i] = 0;
                isMerged = true;
                score += row[i - 1];
                setScore(score);
            }
        }
        return isMerged;
    }

    @Override
    public void onKeyPress(Key key) {
        if (isGameStopped) {
            if (key == Key.SPACE) {
                isGameStopped = false;
                createGame();
                drawScene();
                return;
            } else return;
        }
        if (!canUserMove()) {
            gameOver();
            return;
        }
        switch (key) {
            case LEFT: {
                moveLeft();
                drawScene();
                break;
            }
            case RIGHT: {
                moveRight();
                drawScene();
                break;
            }
            case UP: {
                moveUp();
                drawScene();
                break;
            }
            case DOWN: {
                moveDown();
                drawScene();
                break;
            }
        }
    }

    private void moveLeft() {
        boolean isNewNumber = false;
        for (int[] row : gameField) {
            if (compressRow(row)) {
                isNewNumber = true;
            }
            if (mergeRow(row)) {
                compressRow(row);
                isNewNumber = true;
            }
        }
        if (isNewNumber) {
            createNewNumber();
        }
    }

    private void moveRight() {
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
    }

    private void moveUp() {
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
    }

    private void moveDown() {
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
    }

    private void rotateClockwise() {
        int[][] copy = new int[4][4];
        for (int y = 0; y < gameField.length; y++) {
            for (int x = 0; x < gameField[y].length; x++) {
                copy[x][gameField[y].length - 1 - y] = gameField[y][x];
            }
        }
        gameField = copy;
    }

    private int getMaxTileValue() {
        int max = gameField[0][0];
        for (int y = 0; y < gameField.length; y++) {
            for (int x = 0; x < gameField[y].length; x++) {
                if (max < gameField[y][x]) {
                    max = gameField[y][x];
                }
            }
        }
        return max;
    }

    private void win() {
        isGameStopped = true;
        showMessageDialog(Color.WHITE, "You Win", Color.GREEN, 75);
    }

    private boolean canUserMove() {
        for (int y = 0; y < gameField.length; y++) {
            for (int x = 0; x < gameField[y].length; x++) {
                if (gameField[y][x] == 0) {
                    return true;
                } else {
                    if ( x < SIDE - 1 && (gameField[y][x] == gameField[y][x + 1])
                            || (y < SIDE - 1 && gameField[y][x] == gameField[y + 1][x])) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void gameOver() {
        isGameStopped = true;
        showMessageDialog(Color.BLACK, "You Lose", Color.RED, 75);
    }
}
