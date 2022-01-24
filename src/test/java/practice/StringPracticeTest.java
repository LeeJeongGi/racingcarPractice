package practice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringPracticeTest {

    @Test
    public void split_Test() {
        String value = "1,2";

        String[] result = value.split(",");

        assertThat(result).containsExactly("1", "2");

        value = "1";
        result = value.split(",");
        assertThat(result).containsExactly("1");
    }

    @Test
    public void subString_Test() {
        String value = "(1,2)";
        value = value.substring(1, value.length() - 1);

        assertThat(value).isEqualTo("1,2");
    }

    @Test
    @DisplayName("charAt 메서드를 실행할 때 범위를 벗어나면 오류 발생")
    public void charAtTest() {
        String value = "abc";
        char first = value.charAt(0);
        char second = value.charAt(1);
        char third = value.charAt(2);

        assertThat(first).isEqualTo('a');

        assertThatThrownBy(() ->
                value.charAt(3)).isInstanceOf(StringIndexOutOfBoundsException.class);
    }
}
