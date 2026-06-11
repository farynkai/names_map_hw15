package app;

import java.util.LinkedHashMap;
import java.util.Map;

public class DataRepository {

    public Map<Integer, String> getData() {
        Map<Integer, String> users = new LinkedHashMap<>();
        users.put(101, "Alice");
        users.put(145, "Bob");
        users.put(172, "Carol");
        users.put(210, "David");
        users.put(253, "Eve");
        return users;
    }
}
