package Exceptions;

public class NotInRangeException extends Exception {

    public NotInRangeException(int min, int max) {
        super("Your guess have to be equal or higher than " + min + " and equal or less than " + max);
    }
}
