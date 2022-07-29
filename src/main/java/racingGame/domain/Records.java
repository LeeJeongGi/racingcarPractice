package racingGame.domain;

import java.util.List;

public class Records {

    private static List<Record> records;

    public Records(List<Record> records) {
        this.records = records;
    }

    public static Records from(List<Record> records) {
        return new Records(records);
    }

    public static List<Record> getRecords() {
        return records;
    }
}
