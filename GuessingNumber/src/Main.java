import Exceptions.MinimumHigherThanMaximumException;
import Exceptions.NotInRangeException;
import Messages.StartGameMessages;
import Functionality.Game;

public class Main {

    public static void main(String[] args) {
        StartGameMessages.startUpMessage();
        StartGameMessages.showInstructions();

        try {
            System.out.print("Minimum number: ");
            int min = Game.getClientInput();

            System.out.print("Maximum number: ");
            int max = Game.getClientInput();

            Game game = new Game(min, max);

            System.out.print("Your guess: ");
            int guess = Game.getClientInput();

            game.begin(guess);
        } catch (MinimumHigherThanMaximumException | NotInRangeException exception) {
            exception.printStackTrace();
        }
    }
}
