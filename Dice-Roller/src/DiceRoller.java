import Game.ThrowDice;
import Messages.StartGameMessages;

public class DiceRoller {

    public static void main(String[] args) {

        StartGameMessages.startUpMessage();
        StartGameMessages.showInstructions();

        ThrowDice dice = new ThrowDice();
        while (true) {
            System.out.print("How many dices?: ");
            dice.setNumbersOfDices(dice.getClientNumbersOfDice());

            System.out.print("What face do you think will be?: ");
            dice.getClientGuess();

            dice.generateGame();
        }
    }
}
