package racingGame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class UserTest {

    @Test
    void 생성_테스트() {
        User user = new User("pobi");

        assertThat(user).isEqualTo(new User("pobi"));
    }

    @Test
    @DisplayName("이름은 5글자를 초과 할 수 없다")
    void nameLengthOverTest() {
        assertThatThrownBy(() ->
                new User("jeonggi")).isInstanceOf(IllegalArgumentException.class);
    }
}
