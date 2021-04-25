import Exceptions.InvalidInputException;
import Functionality.Algorithm;

public class Main {

    public static void main(String[] args) {

        Algorithm algorithm;

        for (int i = 1; i <= 100; i++) {
            try {
                algorithm = new Algorithm(i);
                System.out.println(algorithm.determineOutput());
            } catch (InvalidInputException exception) {
                exception.printStackTrace();
            }
        }
    }
}
