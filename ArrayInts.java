import java.util.Random;
import java.util.Scanner;

public class ArrayInts {

    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        int[] array = new Random().ints(100, 0, 100).toArray();

        int answer = 0;
        boolean isValid = false;

        System.out.println("Enter an integer between 0-99 for the corresponding index to view the hidden number");

        while (!isValid) {

            try {

                answer = userInput.nextInt();
                int value = array[answer];

                System.out.println("The number at index " + answer + " is " + value);
                isValid = true;

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Input out of bounds. Enter an integer between 0-100");
                userInput.nextLine();

            } catch (Exception e) {
                System.out.println("Invalid. Please enter an integer");
                userInput.nextLine();
            }
        }

    }
}
