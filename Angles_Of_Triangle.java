import java.util.Scanner;

public class Angles_Of_Triangle {

    // Case Study: Computing Angles of a Triangle


    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.println("Lets calculate the sides and angles of a triangle shall we?");

        //Enter the points
        System.out.println("\nEnter three points of a triangle");

        double x1 = userInput.nextDouble();
        double y1 = userInput.nextDouble();
        double x2 = userInput.nextDouble();
        double y2 = userInput.nextDouble();
        double x3 = userInput.nextDouble();
        double y3 = userInput.nextDouble();


        //Calculate sides
        double a = sideA(x2, y2, x3, y3);
        double b = sideB(x1, y1, x3, y3);
        double c = sideC(x1, y1, x2, y2);


        System.out.println("Approximate values to nearest integer :");
        System.out.println();

        System.out.println("Side a = : " + Math.round(a));
        System.out.println("Side b = : " + Math.round(b));
        System.out.println("Side c = : " + Math.round(c));

        //Calculate angles

        double A = angleA(a, b, c);
        double B = angleB(a, b, c);
        double C = angleC(a, b, c);
        
        System.out.println("Angle A = : " + Math.round(A));
        System.out.println("Angle B = : " + Math.round(B));
        System.out.println("Angle C = : " + Math.round(C));
    }


    public static double sideA (double x2, double y2, double x3, double y3) {

        return  Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
    }


    public static double sideB (double x1, double y1, double x3, double y3) {

        return  Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
    }


    public static double sideC (double x1, double y1, double x2, double y2) {

        return  Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }


    public static double angleA (double a, double b, double c) {

        return Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
    }


    public static double angleB (double a, double b, double c) {

        return Math.toDegrees(Math.acos(((b * b - a * a - c * c) / (-2 * a * c))));
    }


    public static double angleC (double a, double b, double c) {

        return Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));
    }

}
