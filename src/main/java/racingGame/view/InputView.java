package racingGame.view;

import racingGame.domain.User;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {

    private static final String CAR_INPUT_QUESTION = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private static final String ROUND_INPUT_QUESTION = "시도할 회수는 몇 회 인가요?";
    private static final String DELIMITER = ",";
    private static Scanner sc = new Scanner(System.in);

    public static List<User> inputOfUser() {

        System.out.println(CAR_INPUT_QUESTION);
        String inputUser = sc.nextLine();

        return Arrays.stream(inputUser.split(DELIMITER))
                .map(User::from)
                .collect(Collectors.toList());
    }

    public static int inputOfAttempts() {

        System.out.println(ROUND_INPUT_QUESTION);
        return sc.nextInt();
    }

}
