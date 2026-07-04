package app;

public class Main {

    public static void main(String[] args) {
        DataRepository dataRepository = new DataRepository();
        DataHandler handler = new DataHandler(dataRepository);

        System.out.println(handler.getAll());

        try {
            System.out.println(handler.getById(172));
            System.out.println(handler.getById(999));
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
