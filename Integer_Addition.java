import java.util.Scanner;

public class Integer_Addition {

    // **2.6 Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer

    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.println("Enter a series of integers between 0 and 1000");
        System.out.println("\nOnce you hit enter, the sum of the integers will be shown");

        int userNumber = userInput.nextInt();


        //Check if valid input

        if (userNumber < 0 || userNumber > 1000)
        {
            System.out.println("This is an invalid number! Please enter again");
        }


        //Extract from sum and cut off extracted /=

        else
        {
            int sum = 0;


            while (userNumber > 0)
            {
                sum += userNumber % 10;
                userNumber /= 10;
            }

            System.out.println("\nThe sum of the digits is " + sum);
        }
    }
}


