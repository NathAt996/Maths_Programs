import java.util.Scanner;

public class Pythagoras_Theorem {

    public static void main(String[] args) {

        //Case Study: Computing Pythagoras Theorem with method

        Scanner userInput = new Scanner(System.in);

        System.out.println("Choose which side you wish to calculate: " +
                "side A = 1 " +
                "side B = 2 " +
                "side C = 3");

        int choice = userInput.nextInt();

        if (choice == 1) {

            //calculate side A here

            System.out.println("Enter value for side B : ");
            double sideB = userInput.nextDouble();

            System.out.println("Enter value for side C : ");
            double sideC = userInput.nextDouble();

            double result = sideALength(sideB, sideC);

            System.out.println("The length of side A = " + Math.round(result));
        }


        else if (choice == 2) {

            //calculate side B here

            System.out.println("Enter value for side A : ");
            double sideA = userInput.nextDouble();

            System.out.println("Enter value for side C : ");
            double sideC = userInput.nextDouble();

            double result = sideBLength(sideA, sideC);

            System.out.println("The length of side B = " + Math.round(result));
        }


        else if (choice == 3) {

            //calculate side C here

            System.out.println("Enter value for side A : ");
            double sideA = userInput.nextDouble();

            System.out.println("Enter value for side B : ");
            double sideB = userInput.nextDouble();

            double result = Hypotenuse(sideA, sideB);

            System.out.println("The hypotenuse of the triangle = " + Math.round(result));
        }


        else {

            System.out.println("Invalid input");
        }

    }


    public static double Hypotenuse (double a, double b) {

        return Math.sqrt(a * a + b * b);
    }


    public static double sideALength (double b, double c) {

        return Math.sqrt(c * c - b * b);
    }

    public static double sideBLength (double a, double c) {

        return Math.sqrt(c * c - a * a);
    }
}
