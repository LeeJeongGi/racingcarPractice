package racingGame.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LocationTest {

    @Test
    void create() {
        Location location = Location.from(0);

        assertThat(location.getLocation()).isEqualTo(0);
    }

    @Test
    void 위치_증가() {
        Location location = Location.from(0);
        location.increase();

        assertThat(location.getLocation()).isEqualTo(1);
    }
}
