package Exceptions;

public class NotInRangeException extends Exception {

    public NotInRangeException() {
        super("The dice has faces between 1 and 6");
    }
}
