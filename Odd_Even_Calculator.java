import java.util.Scanner;

public class Odd_Even_Calculator {

    public static void main(String[] args)
    {
        //Calculate if number even or odd

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter any integer value");

        int num = userInput.nextInt();


        if (num % 2 == 0) {

            System.out.println(num + " is an even number");
        }


        else {

            System.out.println(num + " is an odd number");
        }
    }
}
