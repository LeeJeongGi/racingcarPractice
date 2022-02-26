package racingGame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class RoundTest {

    @Test
    void create() {
        Round round = new Round(3);

        assertThat(round.getRound()).isEqualTo(3);
    }

    @Test
    @DisplayName("라운드는 10회 이상 진행 할 수 없다.")
    void roundExceptionTest() {

        assertThatThrownBy(() ->
                new Round(10)).isInstanceOf(IllegalArgumentException.class);
    }
}
