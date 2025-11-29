import java.util.Scanner;

public class Find_Fibonacci {

    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.println("Enter an integer index to see what number this represents in the Fibonacci sequence");
        int number = userInput.nextInt();

        System.out.println("\nIndex " + number + " in the Fibonacci sequence is " + Fibonacci(number));
    }

    public static int Fibonacci (int n) {

        if (n <= 1) {
            return n;
        }

        else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }
}
