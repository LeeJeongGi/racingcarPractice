package racingGame.domain;

import racingGame.service.MovingStrategy;

import java.util.Random;

public class Car {

    private static Random random = new Random();

    private static int location;

    public Car (int location) {
        this.location = location;
    }

    public void move(MovingStrategy movingStrategy) {
        if(movingStrategy.movable()) {
            this.location++;
        }
    }

    public static int getLocation() {
        return location;
    }
}
