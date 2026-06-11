package app;

import java.util.Map;

public class DataHandler {

    private final Map<Integer, String> users;

    public DataHandler(Map<Integer, String> users) {
        this.users = users;
    }

    public String getAll() {
        StringBuilder sb = new StringBuilder("\nALL NAMES:\n");
        int index = 0;
        for (Map.Entry<Integer, String> entry : users.entrySet()) {
            sb.append(String.format("%d) id=%d, %s%n",
                    ++index, entry.getKey(), entry.getValue()));
        }
        return sb.toString();
    }

    public String getById(int id) {
        if (users.containsKey(id)) {
            return String.format("\nNAME: id=%d, %s", id, users.get(id));
        }
        return String.format("\nNo user found with id=%d", id);
    }
}
