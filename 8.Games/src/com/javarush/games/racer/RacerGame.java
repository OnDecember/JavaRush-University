package com.javarush.games.racer;

import com.javarush.engine.cell.*;
import com.javarush.games.racer.road.RoadManager;

public class RacerGame extends Game {

    public static final int WIDTH = 64;
    public static final int HEIGHT = 64;
    public static final int CENTER_X = WIDTH / 2;
    public static final int ROADSIDE_WIDTH = 14;
    private static final int RACE_GOAL_CARS_COUNT = 40;

    private RoadMarking roadMarking;
    private PlayerCar player;
    private RoadManager roadManager;
    private FinishLine finishLine;
    private ProgressBar progressBar;

    private boolean isGameStopped;
    private int score;


    @Override
    public void initialize() {
        showGrid(false);
        setScreenSize(WIDTH, HEIGHT);
        createGame();
    }

    private void createGame() {
        roadMarking = new RoadMarking();
        player = new PlayerCar();
        roadManager = new RoadManager();
        finishLine = new FinishLine();
        progressBar = new ProgressBar(RACE_GOAL_CARS_COUNT);
        isGameStopped = false;
        score = 3500;
        setTurnTimer(40);
        drawScene();
    }

    private void drawScene() {
        drawField();
        roadMarking.draw(this);
        player.draw(this);
        roadManager.draw(this);
        finishLine.draw(this);
        progressBar.draw(this);
    }

    private void drawField() {
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                if (x == CENTER_X) {
                    setCellColor(x, y, Color.WHITE);
                } else if (x >= ROADSIDE_WIDTH && x < WIDTH - ROADSIDE_WIDTH) {
                    setCellColor(x, y, Color.DIMGRAY);
                } else {
                    setCellColor(x, y, Color.GREEN);
                }
            }
        }
    }

    @Override
    public void setCellColor(int x, int y, Color color) {
        if (x < 0 || x > WIDTH -1) {
            return;
        }
        if (y < 0 || y > HEIGHT - 1) {
            return;
        }
        super.setCellColor(x, y, color);
    }

    private void moveAll() {
        roadMarking.move(player.speed);
        player.move();
        roadManager.move(player.speed);
        finishLine.move(player.speed);
        progressBar.move(roadManager.getPassedCarsCount());
    }

    @Override
    public void onTurn(int step) {
        boolean isCrush = roadManager.checkCrush(player);
        if (isCrush) {
            gameOver();
            drawScene();
            return;
        }
        if (roadManager.getPassedCarsCount() >= RACE_GOAL_CARS_COUNT) {
            finishLine.show();
        }
        roadManager.generateNewRoadObjects(this);
        if (finishLine.isCrossed(player)) {
            win();
            drawScene();
            return;
        }
        score -= 5;
        setScore(score);
        moveAll();
        drawScene();
    }

    @Override
    public void onKeyPress(Key key) {
        switch (key) {
            case RIGHT: {
                player.setDirection(Direction.RIGHT);
                break;
            }
            case LEFT: {
                player.setDirection(Direction.LEFT);
                break;
            }
            case SPACE: {
                if (isGameStopped) {
                    createGame();
                }
                break;
            }
            case UP: {
                player.speed = 2;
                break;
            }
        }
    }

    @Override
    public void onKeyReleased(Key key) {
        switch (key) {
            case RIGHT: {
                if (player.getDirection() == Direction.RIGHT) {
                    player.setDirection(Direction.NONE);
                }
                break;
            }
            case LEFT: {
                if (player.getDirection() == Direction.LEFT) {
                    player.setDirection(Direction.NONE);
                }
                break;
            }
            case UP: {
                player.speed = 1;
                break;
            }
        }
    }

    private void gameOver() {
        isGameStopped = true;
        stopTurnTimer();
        player.stop();
        showMessageDialog(Color.BLACK, "Ops", Color.RED, 75);
    }

    private void win() {
        isGameStopped = true;
        showMessageDialog(Color.WHITE, "WIN", Color.GREEN, 75);
        stopTurnTimer();
    }
}
