package racingGame.domain;

import racingGame.service.CarMovingStrategy;
import racingGame.service.MovingStrategy;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private static MovingStrategy movingStrategy = new CarMovingStrategy();

    private static List<Car> cars = new ArrayList<>();

    private Cars(int inputValue) {

        for(int i = 0; i < inputValue; i++) {
            cars.add(Car.from(Location.from(0)));
        }

    }

    public static Cars from(int inputValue) {
        return new Cars(inputValue);
    }

    public List<Car> startRace() {

        List<Car> moveCars = this.getCars();

        for (int i = 0; i < moveCars.size(); i++) {
            moveCars.get(i).move(movingStrategy.movable());
        }

        return cars;
    }

    public int size() {
        return cars.size();
    }

    public List<Car> getCars() {
        return cars;
    }
}
