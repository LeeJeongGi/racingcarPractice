package practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class CollectionTest {

    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    @DisplayName("크기 확인 테스트")
    public void 크기_Test() {
        assertThat(numbers.size()).isEqualTo(3);
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    @DisplayName("ParameterizedTest를 활용한 테스트 케이스")
    public void 값_test(Integer data) {
        assertThat(numbers.contains(data)).isTrue();
    }

    @ParameterizedTest
    @CsvSource(value = {"1 : true" , "2 : true", "3 : true"
                        , "4 : false", "5 : false"}, delimiter = ':')
    public void 트루펄스테스트(int input, boolean expected) {
        assertThat(numbers.contains(input)).isEqualTo(expected);
    }

}
