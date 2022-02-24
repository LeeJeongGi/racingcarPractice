package racingGame.service;

import java.util.Random;

public class CarMovingStrategy implements MovingStrategy {

    private static Random random = new Random();
    private static final int FORWARD_MIN = 4;
    private static final int MAX_BOUND = 10;

    @Override
    public boolean movable() {
        return getRandomValue() >= FORWARD_MIN;
    }

    private int getRandomValue() {
        return random.nextInt(MAX_BOUND);
    }
}
