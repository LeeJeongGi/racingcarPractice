package racingGame.controller;

import racingGame.domain.*;
import racingGame.view.InputView;
import racingGame.view.OutputView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RacingGame {

    public void start() {

        InputView inputView = new InputView();
        OutputView outputView = new OutputView();

        List<User> users = inputView.inputOfUser();
        List<Car> carList = users.stream()
                            .map(Car::from)
                            .collect(Collectors.toList());

        Cars cars = Cars.from(carList);
        Round round = new Round(inputView.inputOfAttempts());
        Records records;

        outputView.resultInsert();
        while (round.isNotEnd()) {
            cars.startRace();
            outputView.roundResult(cars);
        }

    }
}
