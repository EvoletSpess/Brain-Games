package hexlet.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Progression {
    public static void game() {
        Scanner scanner = new Scanner(System.in);
        String userName = Engine.greetUser(scanner);
        System.out.println("What number is missing in the progression?");
        final int roundsNumber = 3;

        var i = 0;
        while (i < roundsNumber) {
            List<String> progression = generateProgression();

            int missingIndex = Utils.randomNumbersGenerator(progression.size());

            String missingNumber = progression.get(missingIndex);

            progression.set(missingIndex, "..");

            String question = String.join(" ", progression);

            String answer = Engine.questionAndAnswer(question, scanner);

            if (Engine.winOrLose(missingNumber, answer, userName)) {
                i++;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }

    public static List<String> generateProgression() {
        final int randomNumberRange = 10;
        int randIntOne = Utils.randomNumbersGenerator(randomNumberRange);
        int randIntTwo = Utils.randomNumbersGenerator(randomNumberRange) + 1;

        List<String> progression = new ArrayList<>();

        for (int i = 0; i < randomNumberRange; i++) {
            progression.add(String.valueOf(randIntOne + randIntTwo * i));
        }
        return progression;
    }
}
