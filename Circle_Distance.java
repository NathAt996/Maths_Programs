import java.util.Scanner;

public class Circle_Distance {

    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.println("Enter X and Y coordinates to test if it is within a circle");

        System.out.println("\nEnter coordinate X: ");
        double x = userInput.nextDouble();

        System.out.println("\nEnter coordinate Y: ");
        double y = userInput.nextDouble();

        double distance = circleDistance(x, y);

        System.out.println();

        if (distance <= 10) {
            System.out.println(STR."Coordinates: (\{x}, \{y}) are in a circle");
        }

        else {
            System.out.println(STR."Coordinates: (\{x}, \{y}) are outside of a circle");
        }

    }

    public static double circleDistance (double x, double y) {
        return Math.sqrt((x * x) + (y * y));
    }
}
