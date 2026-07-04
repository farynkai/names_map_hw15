package app;

import java.util.List;
import java.util.Map;

public class DataRepository {

    private static final Map<Integer, User> USERS_BY_ID_MAP = Map.of(
            101, new User(101, "Alice"),
            145, new User(145, "Bob"),
            172, new User(172, "Carol"),
            210, new User(210, "David"),
            253, new User(253, "Eve")
    );

    private static final List<User> ALL_USERS = List.copyOf(USERS_BY_ID_MAP.values());

    public List<User> getData() {
        return ALL_USERS;
    }

    public User getById(int id) {
        User user = USERS_BY_ID_MAP.get(id);
        if (user == null) {
            throw new UserNotFoundException(id);
        }
        return user;
    }
}
