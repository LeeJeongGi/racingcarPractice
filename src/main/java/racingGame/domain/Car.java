package racingGame.domain;

import racingGame.service.MovingStrategy;

import java.util.Random;

public class Car {

    private static Random random = new Random();

    private static Location location;

    private Car (Location location) {
        this.location = location;
    }

    public static Car from(Location location) {
        return new Car(location);
    }

    public void move(MovingStrategy movingStrategy) {
        if(movingStrategy.movable()) {
            this.location.increase();
        }
    }

    public static int getLocation() {
        return location.getLocation();
    }
}
