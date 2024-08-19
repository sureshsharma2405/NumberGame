import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chances = 8;
        int score = 0;
        boolean playAgain = true;

        System.out.println("Welcome to Number Guessing Game:");
        System.out.println("Hey Player, you have " + chances + " chances to win the game");

        while (playAgain) {
            Random random = new Random();
            int randno = random.nextInt(100); // Generates a random number between 0 and 99
            boolean guess = false;

            for (int i = 1; i <= chances; i++) {
                System.out.println("Chance " + i + " - Enter your guess:");
                int user = sc.nextInt();

                if (user == randno) {
                    guess = true;
                    score += 1;
                    System.out.println("You Won!");
                    break;
                } else if (user < randno) {
                    System.out.println("Too Low");
                } else {
                    System.out.println("Too High");
                }
            }

            if (!guess) {
                System.out.println("Sorry you attempted all chances. The correct number was " + randno);
            }

            System.out.println("Do you want to play again? (yes/no)");
            sc.nextLine(); // Consume the newline character left by sc.nextInt()
            String PAResponse = sc.nextLine();
            playAgain = PAResponse.equalsIgnoreCase("yes");
        }

        System.out.println("That's it. Hope you enjoyed the game!");
        System.out.println("Here is your score: " + score);
    }
}