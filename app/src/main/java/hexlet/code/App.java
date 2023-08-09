package hexlet.code;

import java.util.Scanner;

import hexlet.games.Calculator;
import hexlet.games.Even;

public class App {
    public static void main(String[] args) {
        String choice = mainMenu();
        Scanner scanner = new Scanner(System.in);

        switch (choice) {
            case "0" -> {
            }
            case "1" -> Engine.greetUser(scanner);
            case "2" -> {
                System.out.println();
                Even.game();
            }
            case "3" -> {
                System.out.println();
                Calculator.game();
            }
            default -> System.out.println("Wrong input. Please try again.");
        }
    }
    public static String mainMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        return scanner.next();
    }
}
