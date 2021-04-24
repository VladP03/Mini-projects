package Game;

import Exceptions.InvalidInputException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThrowDiceTest {

    @Test
    void ThrowDice_ShouldThrowInvalidInputException() {

        Exception exception = assertThrows(InvalidInputException.class, () -> {
            ThrowDice dice = new ThrowDice();
            dice.setNumbersOfDices(0);
        });

        String expectedMessage = "The value most be at least 1";
        String actualMessage = exception.getMessage();

        assertTrue(expectedMessage.contains(actualMessage));
    }
}