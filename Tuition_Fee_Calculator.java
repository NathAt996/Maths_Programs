import java.util.Scanner;

public class Tuition_Fee_Calculator {

    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.println("Enter a compound interest rate. Eg, 5% = 1.05");
        double rate = userInput.nextDouble();

        System.out.println("Enter the starting tuition fee");
        double tuition = userInput.nextDouble();
        double endTuition = endTuition(tuition);

        int year = 0;

        while (tuition < endTuition) {

            tuition = (tuition * rate);
            year++;
        }

        System.out.println("At year " + year + " the tuition fee will be over double its original value");
        System.out.printf("The tuition will be approximately £%.2f in %1d years", tuition, year);

    }


    public static double endTuition (double t) {

        return t * 2;
    }
}
