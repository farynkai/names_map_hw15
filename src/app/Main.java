package app;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> users = new DataRepository().getData();
        DataHandler handler = new DataHandler(users);

        System.out.println(handler.getAll());
        System.out.println(handler.getById(172));
        System.out.println(handler.getById(999));
    }
}

