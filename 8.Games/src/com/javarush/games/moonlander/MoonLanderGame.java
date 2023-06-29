package com.javarush.games.moonlander;

import com.javarush.engine.cell.*;

public class MoonLanderGame extends Game {

    public static final int WIDTH = 64;
    public static final int HEIGHT = 64;

    private Rocket rocket;
    private GameObject landscape;
    private GameObject platform;
    private boolean isUpPressed;
    private boolean isLeftPressed;
    private boolean isRightPressed;
    private boolean isGameStopped;
    private int score = 0;

    @Override
    public void initialize() {
        setScreenSize(WIDTH, HEIGHT);
        showGrid(false);
        createGame();
    }

    private void createGame() {
        isUpPressed = false;
        isLeftPressed = false;
        isRightPressed = false;
        isGameStopped = false;
        createGameObjects();
        score = 1000;
        drawScene();
        setTurnTimer(50);
    }

    private void drawScene() {
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                setCellColor(x, y, Color.BLACK);
            }
        }
        rocket.draw(this);
        landscape.draw(this);
    }

    @Override
    public void onKeyPress(Key key) {
        switch (key) {
            case UP: {
                isUpPressed = true;
                break;
            }
            case LEFT: {
                isLeftPressed = true;
                isRightPressed = false;
                break;
            }
            case RIGHT: {
                isRightPressed = true;
                isLeftPressed = false;
                break;
            }
            case SPACE: {
                if (isGameStopped) {
                    createGame();
                }
            }
        }
    }

    @Override
    public void onKeyReleased(Key key) {
        switch (key) {
            case UP: {
                isUpPressed = false;
                break;
            }
            case LEFT: {
                isLeftPressed = false;
                break;
            }
            case RIGHT: {
                isRightPressed = false;
                break;
            }
        }
    }

    private void createGameObjects(){
        rocket = new Rocket(WIDTH / 2, 0);
        landscape = new GameObject(0, 25, ShapeMatrix.LANDSCAPE);
        platform = new GameObject(23, HEIGHT - 1, ShapeMatrix.PLATFORM);
    }

    @Override
    public void onTurn(int step) {
        if (score > 0) {
            score--;
        }
        rocket.move(isUpPressed, isLeftPressed, isRightPressed);
        check();
        setScore(score);
        drawScene();
    }

    @Override
    public void setCellColor(int x, int y, Color color) {
        if ((x > WIDTH - 1 || x < 0)
                || (y > HEIGHT - 1 || y < 0)) {
            return;
        }
        super.setCellColor(x, y, color);
    }

    private void check() {
        if (rocket.isCollision(landscape) && !rocket.isCollision(platform)) {
            gameOver();
        } else if (rocket.isCollision(platform)) {
            if (rocket.isStopped()) {
                win();
            } else {
                gameOver();
            }
        }
    }

    private void win() {
        isGameStopped = true;
        rocket.land();
        showMessageDialog(Color.WHITE, "You Win", Color.GREEN, 75);
        stopTurnTimer();
    }

    private void gameOver() {
        isGameStopped = true;
        score = 0;
        rocket.crash();
        showMessageDialog(Color.WHITE, "You Lose", Color.RED, 75);
        stopTurnTimer();
    }
}
