package Messages;

import java.util.Arrays;

public class StartGameMessages {

    public static void startUpMessage() {

        System.out.println("**************************");
        System.out.println("* Welcome to Dice Roller *");
        System.out.println("* Made by Vlad Paraschiv *");
        System.out.println("**************************");
        System.out.println();
    }

    public static void showInstructions() {

        System.out.println("There are fellow instructions:");
        System.out.println("1. The dice have 6 faces with 1-6 points");
        System.out.println("2. The computer will throw the dice");
        System.out.println("3. Your job is to guess the number which is on the upper face on the dice");
        System.out.println("4. You can choose at the beginning of the game how many dices on the same time will be throw");
        System.out.println("\nGood luck! :D\n");
    }
}
