package app;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(int id) {
        super(String.format("User not found with id=%d", id));
    }
}
