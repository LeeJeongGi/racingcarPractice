package racingGame.domain;

public class Round {

    private int round;

    public Round(int round) {

        if(round > 9) {
            throw new IllegalArgumentException("최대 진행 할 수 있는 라운드는 9회 입니다");
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
