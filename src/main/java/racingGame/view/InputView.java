package racingGame.view;

import java.util.Scanner;

public class InputView {

    private static final String CAR_INPUT_QUESTION = "자동차 대수는 몇 대 인가요?";
    private static final String ROUND_INPUT_QUESTION = "시도할 회수는 몇 회 인가요?";
    private static Scanner sc = new Scanner(System.in);

    public static int inputOfCar() {

        System.out.println(CAR_INPUT_QUESTION);
        return sc.nextInt();
    }

    public static int inputOfAttempts() {

        System.out.println(ROUND_INPUT_QUESTION);
        return sc.nextInt();
    }

}
