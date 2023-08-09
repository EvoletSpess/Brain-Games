package hexlet.code;

import java.util.Random;

public class Utils {
    public static int randomNumbersGenerator(int choice) {
        Random rand = new Random();
        return rand.nextInt(choice);
    }
}
