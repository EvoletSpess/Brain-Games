package hexlet.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Scanner;

public class GCD {
    public static void game() {
        Scanner scanner = new Scanner(System.in);
        String userName = Engine.greetUser(scanner);
        System.out.println("Find the greatest common divisor of given numbers.");
        var roundsNumber = 3;
        var randomNumberRange = 30;

        var i = 0;
        while (i < roundsNumber) {
            int randIntOne = Utils.randomNumbersGenerator(randomNumberRange) + 1;
            int randIntTwo = Utils.randomNumbersGenerator(randomNumberRange) + 1;

            String result = String.valueOf(calculateResult(randIntOne, randIntTwo));

            String question = randIntOne + " " + randIntTwo;

            String answer = Engine.questionAndAnswer(question, scanner);

            if (Engine.winOrLose(result, answer, userName)) {
                i++;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }

    public static int calculateResult(int a, int b) {
        var gcd = 0;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
