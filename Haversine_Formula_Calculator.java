import java.util.Scanner;

// Calculate the distance between two geographical points using the Haversine formula

public class Haversine_Formula_Calculator {

    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        //Inputs

        System.out.println("Enter point 1 latitude in degrees: ");
        double point1Lat = userInput.nextDouble();


        System.out.println("Enter point 1 longitude in degrees");
        double point1Long = userInput.nextDouble();


        System.out.println("Enter point 2 latitude in degrees: ");
        double point2Lat = userInput.nextDouble();


        System.out.println("Enter point 2 longitude in degrees");
        double point2Long = userInput.nextDouble();


        double distance = (greatCircleDistance(point1Lat, point1Long, point2Lat, point2Long));

        System.out.println("The distance between the two points is " + distance + " km");
    }


    public static double greatCircleDistance (double x1, double y1, double x2, double y2) {

        return 6371.01 * Math.acos(Math.sin(Math.toRadians(x1))
                * Math.sin(Math.toRadians(x2))
                + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2))
                * Math.cos(Math.toRadians(y1 - y2)));
    }
}
