package app;

import java.util.List;

public class DataHandler {

    private final DataRepository dataRepository;

    public DataHandler(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    public String getAll() {
        List<User> users = dataRepository.getData();
        StringBuilder sb = new StringBuilder("\nALL NAMES:\n");
        int index = 1;
        for (User user : users) {
            sb.append(String.format("%d) id=%d, %s%n",
                    index++, user.id(), user.name()));
        }
        return sb.toString();
    }

    public String getById(int id) {
        User user = dataRepository.getById(id);
        return String.format("\nNAME: id=%d, %s", user.id(), user.name());
    }
}
