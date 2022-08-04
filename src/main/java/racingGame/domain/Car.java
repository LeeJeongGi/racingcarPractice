package racingGame.domain;

import java.util.Random;

public class Car {

    private static Random random = new Random();

    private Location location;
    private User user;

    private Car (Location location, User user) {
        this.location = location;
        this.user = user;
    }

    public static Car from(User user) {
        return new Car(Location.from(0), user);
    }

    public static Car from(Location location, User user) {
        return new Car(location, user);
    }

    public void move(boolean decisionMove) {
        if(decisionMove) {
            this.location.increase();
        }
    }

    public int getLocation() {
        return location.getLocation();
    }

    public String getUser() {
        return user.getName();
    }
}
