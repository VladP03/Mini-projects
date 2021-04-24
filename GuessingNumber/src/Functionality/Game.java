package Functionality;

import Exceptions.MinimumHigherThanMaximumException;
import Exceptions.NotInRangeException;
import Messages.DecisionMessages;
import java.util.Random;
import java.util.Scanner;

public class Game {

    private int minNumber;
    private int maxNumber;

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();


    public Game(int minNumber, int maxNumber) throws MinimumHigherThanMaximumException {
        if (minNumber >= maxNumber) {
            throw new MinimumHigherThanMaximumException();
        }

        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
    }

    public void begin(int numberExpected) throws NotInRangeException {

        if (numberExpected < minNumber || numberExpected > maxNumber) {
            throw new NotInRangeException(minNumber, maxNumber);
        }

        int generatedNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;

        if (numberExpected == generatedNumber) {
            DecisionMessages.winMessage(generatedNumber);
        } else {
            DecisionMessages.loseMessage(generatedNumber);
        }
    }

    public static int getClientInput() {
        return scanner.nextInt();
    }
}
