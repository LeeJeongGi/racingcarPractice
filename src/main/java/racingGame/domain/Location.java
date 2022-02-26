package racingGame.domain;

public class Location {

    private int location;

    private Location(int location) {
        this.location = location;
    }

    public static Location from(int location) {
        return new Location(location);
    }

    public int getLocation() {
        return location;
    }

    public void increase() {
        this.location++;
    }
}
