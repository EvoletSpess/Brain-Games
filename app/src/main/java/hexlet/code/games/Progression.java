package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.ArrayList;
import java.util.List;

public class Progression {
    public static final int PROGRESSION_RANGE = 10;
    public static final int PROGRESSION_START = 2;
    public static final int PROGRESSION_STEP = 2;

    public static void game() {
        int rowCount = Engine.ROUNDS_NUMBER;
        int columnCount = 2;
        String gameDescription = "What number is missing in the progression?";
        String[][] answersAndQuestion = new String[rowCount][columnCount];

        for (String[] element : answersAndQuestion) {
            List<String> progression = generateProgression(PROGRESSION_RANGE, PROGRESSION_START, PROGRESSION_STEP);

            int missingIndex = Utils.randomNumbersGenerator(progression.size());

            element[1] = progression.get(missingIndex);

            progression.set(missingIndex, "..");

            element[0] = String.join(" ", progression);
        }
        Engine.winOrLose(answersAndQuestion, gameDescription);
    }

    public static List<String> generateProgression(int progressionRange, int progressionStart, int progressionStep) {
        List<String> progression = new ArrayList<>();

        for (int i = 0; i < progressionRange; i++) {
            progression.add(String.valueOf(progressionStart + progressionStep * i));
        }
        return progression;
    }
}
