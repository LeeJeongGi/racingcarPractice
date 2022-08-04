package racingGame.domain;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RecordTest {

    private List<Car> cars;

    @BeforeEach
    void setUp() {
        List<Car> cars1 = new ArrayList<>();
        cars1.add(Car.from(Location.from(3), User.from("test1")));
        cars1.add(Car.from(Location.from(5), User.from("test2")));
        cars1.add(Car.from(Location.from(10), User.from("test3")));
        cars = cars1;
    }


    @ParameterizedTest
    @DisplayName("객체 생성 테스트")
    @ValueSource(ints = {1,2,3})
    public void createTest(int tryCount) {
        //given
        Record record = Record.from(new Round(tryCount), Cars.from(cars));

        //then
        assertThat(record.getRound()).isEqualTo(tryCount);
    }

}
