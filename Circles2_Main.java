import java.util.Scanner;

public class Circles2_Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.println("Enter a radius to your circle");
        double userRadii = userInput.nextDouble();

        Circles2_Obj circle1 = new Circles2_Obj(userRadii);

        System.out.printf("Area: %.4f", circle1.getArea());
        System.out.println();
        System.out.printf("Perimeter: %.4f", circle1.getPerimeter());

    }
}
