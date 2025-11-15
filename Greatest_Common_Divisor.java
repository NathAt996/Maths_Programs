import java.util.Scanner;

public class Greatest_Common_Divisor {

    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.println("Lets find the common divisor between two integers!\n");

        System.out.println("Enter an integer");
        int n1 = userInput.nextInt();

        System.out.println("Enter another integer");
        int n2 = userInput.nextInt();

        int gcd = 1;
        int k = 2;
        
        while (k <= n1 && k <= n2) {

            if (n1 % k == 0 && n2 % k == 0) {

                gcd = k;
            }

            k++;
        }

        System.out.println("The common divisor between " + n1 + " and " + n2 + " is " + gcd);
    }
}
