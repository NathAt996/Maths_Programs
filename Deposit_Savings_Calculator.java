import java.util.Scanner;

public class Deposit_Savings_Calculator {

    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Savings for deposit calculator: " + "\nEnter a property value");
        double propertyValue = userInput.nextDouble();

        System.out.println("\nEnter a deposit percentage");
        int depositPercentage = userInput.nextInt();

        System.out.println("\nEnter a fixed yearly amount into your LISA");
        double LISA = userInput.nextDouble();

        int year = 0;

        double endSavings = deposit(depositPercentage, propertyValue);

        double governmentContribution = quarterLISA(LISA);

        double endLISA = LISA + governmentContribution;

        while (endLISA < endSavings) {
            endLISA += LISA + governmentContribution;
            year++;
        }

        double cashSavings = endLISA / 2;

        System.out.println("\nIn " + year + " years" + " you will have saved for the " + depositPercentage + "% deposit from just your LISA");

        System.out.printf("\nThe total amount you need to save for the deposit from your LISA alone is £%.2f ", endSavings);
        System.out.println();
        System.out.printf("\nYou could halve this time if you deposit around £%.2f into a savings account ", cashSavings);

    }

    public static double deposit (double p, double w) {
        
        return (p / 100) * w;
    }

    public static double quarterLISA (double lisa) {

        return lisa / 4;
    }
}

