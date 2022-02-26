package racingGame.view;

import racingGame.domain.Car;
import racingGame.domain.Cars;

import java.util.List;

public class OutputView {

    public void resultInsert() {
        System.out.println("실행 결과");
    }

    public void roundResult(Cars cars) {
        List<Car> carList = cars.getCars();


        for(int i = 0; i < carList.size(); i++) {
            printCarMovingResult(carList.get(i));
            System.out.println();
        }
        System.out.println();
    }

    private void printCarMovingResult(Car car) {
        int position = car.getLocation();
        for(int j = 0; j < position; j++) {
            System.out.print("-");
        }
    }

}
