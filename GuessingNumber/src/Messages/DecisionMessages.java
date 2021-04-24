package Messages;

public class DecisionMessages {

    public static void winMessage(int number) {
        System.out.println("Congratulations, the number is: " + number);
    }

    public static void loseMessage(int number) {
        System.out.println("Unfortunatelly, the number generated is: " + number);
    }
}
