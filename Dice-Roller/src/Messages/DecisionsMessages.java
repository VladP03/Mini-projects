package Messages;

import java.util.Arrays;

public class DecisionsMessages {

    public static void decisionMessage(int[] numbersExpected, int[] numbersGenerated, boolean decision) {

        if (decision == true) {
            System.out.println("\nCongratulations!!!");
        } else {
            System.out.println("\nUnfortunatelly ....");
        }

        System.out.println("Dice face: " + Arrays.toString(numbersGenerated));
        System.out.println("Your guess: " + Arrays.toString(numbersExpected));
        System.out.println();
    }
}
