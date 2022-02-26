package racingGame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @Test
    @DisplayName("자동차 여러대를 입력 받아 생성 테스트")
    void create() {
        Cars cars = Cars.from(3);

        assertThat(cars.size()).isEqualTo(3);
    }

}
