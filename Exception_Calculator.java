import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Calculator {

    public static void main(String[] args) {

        final int numberOfQuestions = 5;
        int count = 0;
        int correctCount = 0;
        long startTime = System.currentTimeMillis();

        Scanner userInput = new Scanner(System.in);

        while (count < numberOfQuestions) {

            int numberX = (int) (Math.random() * 13);
            int numberY = (int) (Math.random() * 13);

            System.out.println("What is " + numberX + " times " + numberY + " ?");

            int answer = 0;
            boolean validInput = false;


            while (!validInput) {

                try {
                    answer = userInput.nextInt();
                    validInput = true;

                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter an integer and press Enter:");
                    userInput.nextLine();
                }
            }


            if (answer == numberX * numberY) {
                System.out.println("\n\uD83D\uDE00");
                correctCount++;
            }

            else {
                System.out.println("\n\uD83D\uDE1E");
            }

            count++;

        }

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;

        System.out.println("\nCorrect count: " + correctCount + " out of 5" + "\nTest time is " + totalTime / 1000 + " seconds\n");

        if (userInput != null) {
            userInput.close();
        }

    }
}