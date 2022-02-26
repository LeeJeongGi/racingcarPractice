package racingGame.view;

import racingGame.domain.Car;
import racingGame.domain.Cars;

import java.util.List;

public class OutputView {

    private static final String REMARK = "-";
    private static final String INTRO = "실행 결과";

    public void resultInsert() {
        System.out.println(INTRO);
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
        System.out.print(REMARK);
        for(int j = 0; j < position; j++) {
            System.out.print(REMARK);
        }
    }

}
