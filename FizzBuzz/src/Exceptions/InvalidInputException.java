package Exceptions;

public class InvalidInputException extends Exception{

    public InvalidInputException() {
        super("Number must be al least 1");
    }
}
