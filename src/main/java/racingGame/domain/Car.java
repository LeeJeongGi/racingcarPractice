package racingGame.domain;

import java.util.Random;

public class Car {

    private static Random random = new Random();

    private Location location;

    private Car (Location location) {
        this.location = location;
    }

    public static Car from(Location location) {
        return new Car(location);
    }

    public void move(boolean decisionMove) {
        if(decisionMove) {
            this.location.increase();
        }
    }

    public int getLocation() {
        return location.getLocation();
    }
}
