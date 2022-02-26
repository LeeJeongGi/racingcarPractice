package racingGame.domain;

public class Round {

    private static final int ROUND_MAX = 9;
    private static final String ROUND_OVER_MSG = "최대 진행 할 수 있는 라운드는 9회 입니다";

    private int round;

    public Round(int round) {

        if(round > ROUND_MAX) {
            throw new IllegalArgumentException(ROUND_OVER_MSG);
        }

        this.round = round;
    }

    public int getRound() {
        return round;
    }

    public boolean isNotEnd() {

        if(round > 0) {
            this.round--;
            return true;
        }

        return false;
    }
}
