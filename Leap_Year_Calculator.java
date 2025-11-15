import java.util.Scanner;

public class Leap_Year_Calculator {

    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a year");

        int year = userInput.nextInt();
        userInput.close();


        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);


        System.out.println("Is " + year + " a leap year? " + isLeapYear);
    }
}
