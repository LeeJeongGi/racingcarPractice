package racingGame.domain;

public class Location {

    private static int location;

    private Location(int location) {
        this.location = location;
    }

    public static Location from(int location) {
        return new Location(location);
    }

    public static int getLocation() {
        return location;
    }

    public void increase() {
        this.location++;
    }
}
