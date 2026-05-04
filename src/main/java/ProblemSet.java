public class ProblemSet {
import java.util.Scanner;

public class ProblemSet {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the High Low Guessing Game.");

        int rounds = 0;

        // Input validation for rounds
        while (true) {
            System.out.print("Input a number of rounds to play: ");
            rounds = input.nextInt();

            if (rounds > 0) {
                break;
            } else {
                System.out.println("Invalid Input!");
            }
        }

        int score = 0;

        for (int round = 1; round <= rounds; round++) {

            System.out.println("\nRound " + round + ":");

            System.out.println("\nPlease select High, Low or Even:");
            System.out.println("1. High (11 to 20)");
            System.out.println("2. Low (0 to 9)");
            System.out.println("3. Even(10)");

            int choice;

            // Input validation for menu choice
            while (true) {
                choice = input.nextInt();
                if (choice >= 1 && choice <= 3) {
                    break;
                } else {
                    System.out.println("Invalid Input!");
                }
            }

            int randomNum = (int)(Math.random() * 21); // 0 to 20

            boolean correct = false;

            if (choice == 1 && randomNum >= 11) {
                correct = true;
            } else if (choice == 2 && randomNum <= 9) {
                correct = true;
            } else if (choice == 3 && randomNum == 10) {
                correct = true;
            }

            if (correct) {
                score++;
                System.out.println("\nThe number was " + randomNum + ". You were correct.");
            } else {
                System.out.println("\nThe number was " + randomNum + ". You were incorrect.");
            }

            System.out.println("Current Score: " + score);
        }

        System.out.println("\nTotal Score: " + score);

        if (score >= (rounds / 2.0)) {
            System.out.println("Congratulations you got " + score + " out of " + rounds + " rounds right!");
        } else {
            System.out.println("Better luck next time! You got " + score + " out of " + rounds + " rounds right!");
        }

        input.close();
    }
}	public static void main(String[] args)	}

}
