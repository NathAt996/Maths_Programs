import java.util.Scanner;

public class Multiplication_Practice {

    public static void main(String[] args) {

        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        Scanner userInput = new Scanner(System.in);

        System.out.println("What is " + number2 + " x " + number1 + " ?");

        int answer = userInput.nextInt();

        while (number2 * number1 != answer) {

            System.out.println("Incorrect. What is " + number2 + " x " + number1 + " ?");
            answer = userInput.nextInt();
        }

        System.out.println("Correct! " + answer + " is the product of " + number2 + " multiplied by " + number1);
    }
}
