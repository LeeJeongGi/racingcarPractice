package racingGame.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RecordsTest {

    private List<Car> cars;

    @BeforeEach
    void setUp() {
        List<Car> cars1 = new ArrayList<>();
        cars1.add(Car.from(Location.from(3), User.from("test1")));
        cars1.add(Car.from(Location.from(5), User.from("test2")));
        cars1.add(Car.from(Location.from(10), User.from("test3")));
        cars = cars1;
    }

    @Test
    public void createTest() {
        //given
        List<Record> records = new ArrayList<>();
        records.add(Record.from(new Round(1), Cars.from(cars)));
        records.add(Record.from(new Round(2), Cars.from(cars)));
        records.add(Record.from(new Round(3), Cars.from(cars)));

        //when
        Records collectionRecord = Records.from(records);

        //then
        assertThat(collectionRecord.getRecords().size()).isEqualTo(3);
    }
}
