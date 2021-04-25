package Functionality;

import Exceptions.InvalidInputException;

public class Algorithm {

    private int number;

    public Algorithm() {

    }

    public Algorithm(int number) throws InvalidInputException {
        if (number <1) {
            throw new InvalidInputException();
        }

        this.number = number;
    }

    public StringBuilder determineOutput() {

        StringBuilder output = new StringBuilder();

        if (dividedBy(3)) {
            output.append("Fizz");
        }

        if (dividedBy(5)) {
            output.append("Buzz");
        }

        if (dividedBy(11)) {
            output.append("Jazz");
        }

        if (dividedBy(7)) {
            output.setLength(0);
            output.append("Rizz");
        }

        if (output.length() == 0) {
            output.append(number);
        }

        return output;
    }

    private boolean dividedBy (int divisor) {
        return number % divisor == 0;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
