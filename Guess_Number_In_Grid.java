import java.util.Random;
import java.util.Scanner;

public class Guess_Number_In_Grid {

    public static void main(String[] args) {

        Random random = new Random ();
        Scanner userInput = new Scanner (System.in);

        int mysteryNumber = random.nextInt(16) + 1;

        System.out.println("\nSelect a number from the grid. Try to guess correctly!");
        System.out.println();

        for (int i = 1; i <= 16; i++) {

            System.out.printf("%4d", i);

            if (i % 4 == 0) {
                System.out.println();
            }
        }

        System.out.println();

        int guess;
        int attempt = 0;

        do {
            System.out.println("Enter your guess : ");
            guess = userInput.nextInt();
            attempt ++;


        } while (guess != mysteryNumber);


        if (guess == mysteryNumber) {
            System.out.println("\nCongratulations! You have guessed the mystery number of " + mysteryNumber);
            System.out.println("\nYou did it in " + attempt + " attempts");
        }
    }
}
