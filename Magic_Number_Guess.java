import java.util.Scanner;

public class Magic_Number_Guess {

    public static void main(String[] args) {

        int number = (int)(Math.random() * 101);

        Scanner userInput = new Scanner (System.in);

        System.out.println("Guess a magic number between 0 and 100");

        //initialise guess with a number (that isn't between 0 and 100)

        int guess = -1;

        while (guess != number) {

            System.out.println("\nEnter your guess");
            guess = userInput.nextInt();


            if (guess == number) {

                System.out.println("Correct!");
            }


            else if (guess < number) {

                System.out.println("Too low!");
            }


            else if (guess > number) {

                System.out.println("Too high!");
            }


            else {

                System.out.println("Guess out of range!");
            }
        }
    }
}
