import java.util.Scanner;

public class Polygon_Area_Calculator {

    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.println("A regular polygon area");
        System.out.println("\nEnter the number of sides");

        double n = userInput.nextDouble();

        System.out.println("Enter the length of the side");


        double s = userInput.nextDouble();
        double polygonArea = areaRegularPolygon(n, s);


        System.out.println("The area of the polygon is " + polygonArea);
    }


    public static double areaRegularPolygon (double n, double s) {

        return (n * s * s) / (4 * (Math.tan(Math.PI / n)));
    }

}
