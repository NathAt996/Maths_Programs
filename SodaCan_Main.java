import java.util.Scanner;

public class SodaCan_Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.println("How high in centimetres is your soda can?");
        double H = userInput.nextDouble();

        System.out.println("\nEnter the radius of your soda can");
        double R = userInput.nextDouble();


        SodaCan_Obj can = new SodaCan_Obj();

        can.setHeight(H);
        can.setRadius(R);

        double result = surfaceArea(can.getHeight(), can.getRadius());

        System.out.println();
        System.out.printf("\nThe surface area of the soda can = %.2f", result);

    }

    public static double surfaceArea (double h, double r) {

        return 2 * 3.14159 * r * h + 2 * 3.14159 * r * r;
    }
}
