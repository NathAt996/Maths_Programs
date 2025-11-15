import java.util.Scanner;

public class Mean_Calculator {

    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.println("Enter an integer, the input ends if it is 0");

        int number = 0;

        int sum = 0;
        int numberOfPositives = 0;
        int numberOfNegatives = 0;
        float total = 0;
        float count = 0;

        do {

            number = userInput.nextInt();

            if (number != 0) {

                total = (sum += number);
                count++;

                if (number < 0) {

                    numberOfNegatives++;
                }

                else if (number > 0) {

                    numberOfPositives++;
                }
            }

        } while (number != 0);

        double average = sum / count;

        System.out.println("The number of positives is " + numberOfPositives);
        System.out.println("The number of negatives is " + numberOfNegatives);
        System.out.println("The total is " + total);
        System.out.println("The average is " + average);

    }
}
