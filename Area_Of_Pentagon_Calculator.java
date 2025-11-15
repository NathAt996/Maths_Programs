import java.util.Scanner;

public class Area_Of_Pentagon_Calculator {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a length of a side from centre to a side of a regular pentagon");

        double r = userInput.nextDouble();
        double side = sideCalc(r);
        double result = areaCalc(side);

        System.out.println("The area of the pentagon is " + Math.round(result * 100.00) / 100.00);

    }


    public static double areaCalc (double s) {

        return (5 * s * s) / (4.0 * Math.tan(Math.PI / 5));
    }


    public static double sideCalc (double r) {

        return 2 * r * Math.sin(Math.PI / 5);
    }
}
