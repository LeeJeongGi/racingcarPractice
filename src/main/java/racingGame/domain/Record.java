package racingGame.domain;

public class Record {

    private static Round round;
    private static Cars cars;

    public Record(Round round, Cars cars) {
        this.round = round;
        this.cars = cars;
    }

    public static Record from(Round round, Cars cars) {
        return new Record(round, cars);
    }

    public int getRound() {
        return this.round.getRound();
    }
}
