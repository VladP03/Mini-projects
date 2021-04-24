package Messages;

public class StartGameMessages {

    public static void startUpMessage() {

        System.out.println("******************************");
        System.out.println("* Welcome to Guessing number *");
        System.out.println("*   Made by Vlad Paraschiv   *");
        System.out.println("******************************");
        System.out.println();
    }

    public static void showInstructions() {

        System.out.println("There are fellow instructions:");
        System.out.println("1. Give an range where u want to guess the number");
        System.out.println("2. Type your number");
        System.out.println("\nGood luck! :D\n");
    }
}
