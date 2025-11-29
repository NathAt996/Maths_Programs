import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.println("Enter an integer");
        int number = userInput.nextInt();

        System.out.println("The factorial of " + number + " = " + factorial(number));

    }

    public static int factorial (int n) {

        if (n > 0) {
            return n * factorial(n - 1);
        }

        else {
            return 1;
        }
    }
}
