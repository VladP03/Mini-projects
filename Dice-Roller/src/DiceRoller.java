import Exceptions.InvalidInputException;
import Exceptions.NotInRangeException;
import Game.ThrowDice;
import Messages.StartGameMessages;

public class DiceRoller {

    public static void main(String[] args) {

        StartGameMessages.startUpMessage();
        StartGameMessages.showInstructions();

        try {
            ThrowDice dice = new ThrowDice();

            System.out.print("How many dices?: ");
            dice.setNumbersOfDices(dice.getClientNumbersOfDice());

            System.out.print("What face do you think will be?: ");
            dice.getClientGuess();

            dice.generateGame();
        } catch (NotInRangeException | InvalidInputException exception) {
            exception.printStackTrace();
        }
    }
}
