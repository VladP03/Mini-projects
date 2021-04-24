package Game;

import Exceptions.InvalidInputException;
import Exceptions.NotInRangeException;
import Messages.DecisionsMessages;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ThrowDice {
    private int numbersOfDices;
    private int[] numbersGenerated;
    private int[] numbersExpected;

    private final int minFaceValue = 1;
    private final int maxFaceValue = 6;

    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);


    public ThrowDice() {
        this(1);
    }

    public ThrowDice(int numbersOfDices) {
        this.numbersOfDices =  numbersOfDices;
    }


    public int getClientNumbersOfDice() {
        return scanner.nextInt();
    }

    private void generateRandomNumbers () {
        numbersGenerated = new int[numbersOfDices];

        for (int i=0;i<numbersOfDices;i++) {
            numbersGenerated[i] = random.nextInt(maxFaceValue - minFaceValue + 1) + minFaceValue;
        }
    }

    public void getClientGuess() throws NotInRangeException {
        numbersExpected = new int[numbersOfDices];

        if (numbersOfDices == 1) {
            numbersExpected[0] = getInput();
            if (numbersExpected[0] < 1 || numbersExpected[0]>6) {
                throw new NotInRangeException();
            }
        } else {
            System.out.println();
            for (int i = 0; i < numbersOfDices; i++) {
                System.out.printf("dice[%d]: ", i + 1);
                numbersExpected[i] = getInput();

                if (numbersExpected[i] < 1 || numbersExpected[i]>6) {
                    throw new NotInRangeException();
                }
            }
        }
    }

    private int getInput() {
        return scanner.nextInt();
    }

    public void generateGame() {
        generateRandomNumbers();

        boolean finalDecission = matchArrays();
        DecisionsMessages.decisionMessage(numbersExpected, numbersGenerated, finalDecission);
    }

    private boolean matchArrays() {
        Arrays.sort(numbersExpected);
        Arrays.sort(numbersGenerated);

        return Arrays.equals(numbersExpected, numbersGenerated);
    }

    public void setNumbersOfDices(int numbersOfDices) throws InvalidInputException {

        if (numbersOfDices < 1) {
            throw new InvalidInputException();
        }
        this.numbersOfDices = numbersOfDices;
    }
}
