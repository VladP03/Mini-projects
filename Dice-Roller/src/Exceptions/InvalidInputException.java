package Exceptions;

public class InvalidInputException extends Exception {
    public InvalidInputException() {
        super("The value most be at least 1");
    }
}
