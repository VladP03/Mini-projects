package Functionality;

import Exceptions.MinimumHigherThanMaximumException;
import Exceptions.NotInRangeException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void Game_ShouldThrowMinimumHigherThanMaximumException() {
        Exception minimunHigher = assertThrows(MinimumHigherThanMaximumException.class, () -> {new Game(10,5);});
        Exception equalsBoth = assertThrows(MinimumHigherThanMaximumException.class, () -> {new Game(10,10);});

        String expectedMessage = "Minimum number cannot be equal or higher than maximum";
        String actualMessageHigher = minimunHigher.getMessage();
        String actualMessageEquals = equalsBoth.getMessage();

        assertTrue(expectedMessage.contains(actualMessageHigher));
        assertTrue(expectedMessage.contains(actualMessageEquals));
    }

    @Test
    void Begin_ShouldThrowNotInRangeException() {
        int min=10;
        int max=15;

        Exception exception = assertThrows(NotInRangeException.class, () -> {
            Game game = new Game(min,max);
            game.begin(9);
        });

        String expectedMessage = "Your guess have to be equal or higher than " + min + " and equal or less than " + max;
        String actualMessage = exception.getMessage();

        assertTrue(expectedMessage.contains(actualMessage));
    }
}