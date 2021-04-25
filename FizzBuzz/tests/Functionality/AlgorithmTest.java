package Functionality;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmTest {

    @Test
    void determineOutput(){

        Algorithm algorithm = new Algorithm();

        algorithm.setNumber(1);
        assertTrue(algorithm.determineOutput().toString().contains("1"));

        algorithm.setNumber(2);
        assertTrue(algorithm.determineOutput().toString().contains("2"));

        algorithm.setNumber(3);
        assertTrue(algorithm.determineOutput().toString().contains("Fizz"));

        algorithm.setNumber(4);
        assertTrue(algorithm.determineOutput().toString().contains("4"));

        algorithm.setNumber(6);
        assertTrue(algorithm.determineOutput().toString().contains("Fizz"));

        algorithm.setNumber(10);
        assertTrue(algorithm.determineOutput().toString().contains("Buzz"));

        algorithm.setNumber(7);
        assertTrue(algorithm.determineOutput().toString().contains("Rizz"));

        algorithm.setNumber(31);
        assertTrue(algorithm.determineOutput().toString().contains("31"));

        algorithm.setNumber(33);
        assertTrue(algorithm.determineOutput().toString().contains("Fizz"));
    }
}