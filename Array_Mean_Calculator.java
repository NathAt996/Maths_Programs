import java.util.Scanner;

public class Array_Mean_Calculator {

    public static void main(String[] args) {

        //Create a userInput array that calculates mean

        Scanner userInput = new Scanner (System.in);


        System.out.println("How many elements in your array?");
        int elements = userInput.nextInt();

        double [] myList = new double [elements];

        int sum = 0;

        System.out.println("\nEnter " + myList.length + " values");


        for (int i = 0; i < myList.length; i++) {

            myList[i] = userInput.nextDouble();

            sum += myList[i];
        }

        System.out.println();

        System.out.println("\nThe mean value of the array is " + mean(sum, elements));
    }


    public static double mean (double s, double amount) {

        return s / amount;
    }
}
