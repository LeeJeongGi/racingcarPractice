package racingGame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.assertj.core.api.Java6Assertions.assertThatThrownBy;

public class CarTest {

    @Test
    void 자동차_전진() {
        Car car = Car.from(Location.from(0));

        car.move(true);

        assertThat(car.getLocation()).isEqualTo(1);
    }

    @Test
    void 자동차_정지() {
        Car car = Car.from(Location.from(0));
        car.move(false);

        assertThat(car.getLocation()).isEqualTo(0);
    }

}
