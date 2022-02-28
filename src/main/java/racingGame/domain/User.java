package racingGame.domain;

import java.util.Objects;

public class User {

    private static final String NAME_OVER_SIZE_EXCEPTION = "이름은 5글자를 초과할 수 없습니다";
    private static final int NAME_LENGTH_MAX = 5;

    private String name;

    private User(String name) {

        if(name.length() > NAME_LENGTH_MAX) {
            throw new IllegalArgumentException(NAME_OVER_SIZE_EXCEPTION);
        }

        this.name = name;
    }

    public static User from(String name) {
        return new User(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
