package racingGame.controller;

import racingGame.domain.Cars;
import racingGame.domain.Round;
import racingGame.view.InputView;
import racingGame.view.OutputView;

public class RacingGame {

    public void start() {

        InputView inputView = new InputView();
        OutputView outputView = new OutputView();

        Cars cars = Cars.from(inputView.inputOfCar());
        Round round = new Round(inputView.inputOfAttempts());

        outputView.resultInsert();
        while (round.isNotEnd()) {
            cars.startRace();
            outputView.roundResult(cars);
        }

    }
}
