package Exceptions;

public class MinimumHigherThanMaximumException extends Exception {

    public MinimumHigherThanMaximumException() {
        super("Minimum number cannot be equal or higher than maximum");
    }
}
