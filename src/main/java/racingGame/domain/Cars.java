package racingGame.domain;

import racingGame.service.CarMovingStrategy;
import racingGame.service.MovingStrategy;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private static MovingStrategy movingStrategy = new CarMovingStrategy();

    private List<Car> cars = new ArrayList<>();

    private Cars(int inputValue) {

        if(inputValue > 5) {
            throw new IllegalArgumentException("경주용 자동차는 5대 초과해서 생성 할 수 없습니다.");
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
