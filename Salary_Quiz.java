import java.util.Scanner;

 /*
        Write an if statement that increases pay by 3% if score is greater than 90, otherwise increases pay by 1%.
        */

public class Salary_Quiz {

    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.println("Enter a score");
        int userScore = userInput.nextInt();

        System.out.println("Enter your salary");
        double userSalary = userInput.nextDouble();


        if (userScore >= 90) {

            System.out.println("You scored " + userScore);
            double bonus = percentage(3);

            double finalSalary = (bonus * userSalary) + userSalary;

            System.out.println("Here is your final pay : " +
                    "£" + finalSalary + " per annum");
        }


        else {

            System.out.println("You scored " + userScore);
            double bonus = percentage(1);

            double finalSalary = (bonus * userSalary) + userSalary;

            System.out.println("Here is your final pay : " +
                    "£" + finalSalary + " per annum");
        }
    }

    public static double percentage (double p) {

        return (p / 100);
    }
}
