package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Progression {
    public static final int PROGRESSION_RANGE = 10;
    public static final int PROGRESSION_START = 2;
    public static final int PROGRESSION_STEP = 2;

    public static void game(Scanner scanner) {
        String userName = Engine.greetUser("What number is missing in the progression?", scanner);

        for (var i = 0; true; i++) {
            List<String> progression = generateProgression();

            int missingIndex = Utils.randomNumbersGenerator(progression.size());

            String result = progression.get(missingIndex);

            progression.set(missingIndex, "..");

            String question = String.join(" ", progression);

            Engine.winOrLose(question, result, userName, scanner, i);
            i++;
        }
    }

    public static List<String> generateProgression() {
        List<String> progression = new ArrayList<>();

        for (int i = 0; i < PROGRESSION_RANGE; i++) {
            progression.add(String.valueOf(PROGRESSION_START + PROGRESSION_STEP * i));
        }
        return progression;
    }
}
