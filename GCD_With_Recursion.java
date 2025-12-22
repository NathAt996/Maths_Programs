import java.util.Scanner;

public class GCD_With_Recursion {

    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.println("Enter two integers to find their greatest common divisor");
        int x = userInput.nextInt();
        int y = userInput.nextInt();

        System.out.println("The greatest common divisor between " + x + " and " + y + " is : " + GCD(x, y));

    }

    public static long GCD (long m, long n) {
        if (m % n == 0) {
            return n;
        } else {
            return GCD(n, m % n);
        }
    }
}
