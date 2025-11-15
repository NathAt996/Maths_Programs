import java.util.Scanner;

/*
   Write a program that prompts the user to enter an integer for today’s day of the week
   Prompt the user to enter the number of days after today for a future day and display the future day of the week
 */

public class Day_Of_Week_Calculator {

    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a day of the week between 0-6. Eg, Sunday = 0");
        int today = userInput.nextInt();

        System.out.println("Enter an integer for the number of days elapsed since");
        int elapsed = userInput.nextInt();

        int future = (today + elapsed) % 7;

        String days [] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String todayName = days[today];
        String futureName = days[future];


        System.out.println("Today's day is " + todayName + " and the future day is " + futureName);
    }
}
