package Geometry;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GeoMain {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        boolean isFinished = false;

        System.out.println("--- GEOMETRY CLASS 101 ---");

        while (!isFinished) {

            boolean validInput = false;


            while (!validInput) {

            System.out.println("\nPick a shape: " +
                    "\nTriangle = 1, Circle = 2, Square = 3" +
                    "\nHit 0 to exit");

            try {

                int choice = userInput.nextInt();

                if (choice == 0) {
                    isFinished = true;
                    validInput = true;
                    continue;
                }

                if (choice == 1) {

                    System.out.println("\nYou picked triangle");
                    System.out.println("Enter side lengths A, B and C");
                    double sideA = userInput.nextDouble();
                    double sideB = userInput.nextDouble();
                    double sideC = userInput.nextDouble();

                    System.out.println("\nEnter a height");
                    double height = userInput.nextDouble();

                    Triangle triangle = new Triangle(sideC, height, sideA, sideB);

                    System.out.println("Triangle area : " + triangle.getArea());
                    System.out.println("Triangle perimeter : " + triangle.getPerimeter());
                    validInput = true;
                }

                else if (choice == 2) {

                    System.out.println("\nYou picked circle");
                    System.out.println("Enter a radius");
                    double radius = userInput.nextDouble();

                    Circle circle = new Circle(radius);

                    System.out.println("Circle area : " + circle.getArea());
                    System.out.println("Circle perimeter : " + circle.getPerimeter());
                    validInput = true;
                }

                else if (choice == 3) {

                    System.out.println("\nYou picked square");
                    System.out.println("Enter side A");
                    double sideA = userInput.nextDouble();

                    Square square = new Square (sideA);

                    System.out.println("Square area : " + square.getArea());
                    System.out.println("Square perimeter : " + square.getPerimeter());
                    validInput = true;
                }

                else {
                    System.out.println("Input out of range. Please press 1, 2 or 3.");
                }

            } catch (InputMismatchException e) {

                System.out.println("Invalid: Please enter 1 or 2");
                userInput.nextInt();
            }

           }

            if (isFinished) {

                System.out.println("\nThank you for playing \uD83D\uDE0A");
            }
        }
    }
}
