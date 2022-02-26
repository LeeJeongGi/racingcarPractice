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

    private Cars(int inputValue) {

        if(inputValue > Cars_MAX_NUM) {
            throw new IllegalArgumentException(CarsNumOverMsg);
        }

        for(int i = 0; i < inputValue; i++) {
            cars.add(Car.from(Location.from(0)));
        }
    }

    public static Cars from(int inputValue) {
        return new Cars(inputValue);
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
