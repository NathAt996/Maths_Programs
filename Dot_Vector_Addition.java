import java.util.Scanner;

public class Dot_Vector_Addition {

    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.println("Calculate the measure of the angle between two vectors");

        int dimensions = 0;

        do {
            System.out.println("\nSelect the number of dimensions two your vectors: " +
                    "\n2D = Press 2 " +
                    "\n3D = Press 3");

            if (userInput.hasNext()) {
                dimensions = userInput.nextInt();

                if (dimensions == 2 || dimensions == 3) {
                    break;
                }

                else {
                    System.out.println("Invalid option. Please select either 2 or 3 dimensions");
                }
            }
        } while (dimensions != 2 || dimensions != 3);

        if (dimensions == 2) {

            System.out.println("\nEnter an i and j value for the first vector");

            double i = userInput.nextDouble();
            double j = userInput.nextDouble();

            System.out.println("\nEnter an i and j value for the second vector");

            double i2 = userInput.nextDouble();
            double j2 = userInput.nextDouble();

            double ab = TwoDimensions_AB(i, j, i2, j2);
            double magnitudeProduct = TwoDimensions_MagnitudeProduct(i, j, i2, j2);

            if (magnitudeProduct == 0) {

                System.out.println("Theta cannot be calculated as one or more vectors has a zero magnitude");
            }

            else {

                double angle = ab / magnitudeProduct;
                double theta = Math.toDegrees(angle);

                System.out.println("\nTheta = " + theta + "°");
            }
        }

        if (dimensions == 3) {

            System.out.println("\nEnter an i, j and k value for the first vector");

            double i = userInput.nextDouble();
            double j = userInput.nextDouble();
            double k = userInput.nextDouble();

            System.out.println("\nEnter an i, j and k value for the second vector");

            double i2 = userInput.nextDouble();
            double j2 = userInput.nextDouble();
            double k2 = userInput.nextDouble();

            double ab = ThreeDimensions_AB(i, j, k, i2, j2, k2);
            double magnitudeProduct = ThreeDimensions_MagnitudeProduct(i, j, k, i2, j2, k2);

            if (magnitudeProduct == 0) {

                System.out.println("Theta cannot be calculated as one or more vectors has a zero magnitude");
            }

            else {

                double angle = ab / magnitudeProduct;
                double theta = Math.toDegrees(angle);

                System.out.println("\nTheta = " + theta + "°");
            }
        }
    }

    public static double TwoDimensions_AB (double i1, double j1, double i2, double j2) {
        return i1 * i2 + j1 * j2;
    }

    public static double TwoDimensions_MagnitudeProduct (double i1, double j1, double i2, double j2) {
        double magA = Math.sqrt(i1 * i1 + j1 * j1);
        double magB = Math.sqrt(i2 * i2 + j2 * j2);
        return magA * magB;
    }

    public static double ThreeDimensions_AB (double i1, double j1, double k1, double i2, double j2, double k2) {
        return i1 * i2 + j1 * j2 + k1 * k2;
    }

    public static double ThreeDimensions_MagnitudeProduct (double i1, double j1, double k1, double i2, double j2, double k2) {
        double magA = Math.sqrt(i1 * i1 + j1 * j1 + k1 * k1);
        double magB = Math.sqrt(i2 * i2 + j2 * j2 + k2 * k2);
        return magA * magB;
    }
}