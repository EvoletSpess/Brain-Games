package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.ArrayList;
import java.util.List;

public class Progression {
    private static final int NUM_COLUMNS = 2;
    private static final int NUM_ROWS = Engine.ROUNDS_NUMBER;
    private static final String GAME_DESCRIPTION = "What number is missing in the progression?";
    private static final int PROGRESSION_RANGE = 10;
    private static final int PROGRESSION_START = 2;
    private static final int PROGRESSION_STEP = 2;

    public static void game() {
        String[][] answersAndQuestion = new String[NUM_ROWS][NUM_COLUMNS];

        for (String[] element : answersAndQuestion) {
            List<String> progression = generateProgression(PROGRESSION_RANGE, PROGRESSION_START, PROGRESSION_STEP);

            int missingIndex = Utils.randomNumbersGenerator(progression.size());

            element[1] = progression.get(missingIndex);

            progression.set(missingIndex, "..");

            element[0] = String.join(" ", progression);
        }
        Engine.startGame(answersAndQuestion, GAME_DESCRIPTION);
    }

    private static List<String> generateProgression(int progressionRange, int progressionStart, int progressionStep) {
        List<String> progression = new ArrayList<>();

        for (int i = 0; i < progressionRange; i++) {
            progression.add(String.valueOf(progressionStart + progressionStep * i));
        }
        return progression;
    }
}
