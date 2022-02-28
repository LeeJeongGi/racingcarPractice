package racingGame.domain;

import racingGame.service.CarMovingStrategy;
import racingGame.service.MovingStrategy;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private static final String CarsNumOverMsg = "경주용 자동차는 5대 초과해서 생성 할 수 없습니다.";
    private static final int Cars_MAX_NUM = 5;
    private static MovingStrategy movingStrategy = new CarMovingStrategy();

    private List<Car> cars = new ArrayList<>();

    private Cars(List<Car> cars) {

        if(cars.size() > Cars_MAX_NUM) {
            throw new IllegalArgumentException(CarsNumOverMsg);
        }

        this.cars = cars;
    }

    public static Cars from(List<Car> cars) {
        return new Cars(cars);
    }

    public void startRace() {

        List<Car> moveCars = this.getCars();

        for (int i = 0; i < moveCars.size(); i++) {
            moveCars.get(i).move(movingStrategy.movable());
        }

    }

    public int size() {
        return cars.size();
    }

    public List<Car> getCars() {
        return cars;
    }
}
