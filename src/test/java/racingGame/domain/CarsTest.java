package racingGame.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Java6Assertions.assertThatThrownBy;

public class CarsTest {

    private static Cars cars;

    @BeforeEach
    void setUp() {
        List<Car> cars1 = new ArrayList<>();
        cars1.add(Car.from(User.from("test1")));
        cars1.add(Car.from(User.from("test2")));
        cars1.add(Car.from(User.from("test3")));
        cars = Cars.from(cars1);
    }

    @Test
    @DisplayName("자동차 여러대를 입력 받아 생성 테스트")
    void create() {
        assertThat(cars.size()).isEqualTo(3);
    }

    @Test
    @DisplayName("라운드 실행 결과")
    void racingStartTest() {
        List<Car> carList = cars.getCars();

       carList.get(0).move(true);
       carList.get(1).move(false);
       carList.get(2).move(false);

        assertThat(carList.get(0).getLocation()).isEqualTo(1);
    }

    @Test
    @DisplayName("5대 이상 입력했을 때 예외 처리")
    void countOfOverExceptionTest() {

        List<Car> cars1 = new ArrayList<>();
        cars1.add(Car.from(User.from("test1")));
        cars1.add(Car.from(User.from("test2")));
        cars1.add(Car.from(User.from("test3")));
        cars1.add(Car.from(User.from("test3")));
        cars1.add(Car.from(User.from("test3")));
        cars1.add(Car.from(User.from("test3")));
        cars1.add(Car.from(User.from("test3")));

        assertThatThrownBy(() ->
                Cars.from(cars1)).isInstanceOf(IllegalArgumentException.class);
    }
}
