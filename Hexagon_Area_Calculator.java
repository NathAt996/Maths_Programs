import java.util.Scanner;

public class Hexagon_Area_Calculator {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Area of a Hexagon");

        System.out.println("\nEnter a side");


        double side = userInput.nextDouble();
        double Hexagon = HexagonArea(side);

        System.out.println("The area of the hexagon is : " + Math.round(Hexagon * 100.00) / 100.00);
    }


    public static double HexagonArea (double s) {

        return (6 * s * s) / (4 * Math.tan((Math.PI / 6)));
    }
}
