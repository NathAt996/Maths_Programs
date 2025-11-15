import java.util.Scanner;

public class Circle_Area {

    public static void main(String[] args)
    {
        //Calculate the area of a circle with conditionals

        Scanner userInput = new Scanner (System.in);

        System.out.println("Enter a radius value");

        double userRadius = areaCircle(userInput.nextDouble());


        //Conditions
        if (userRadius >=0) {

            System.out.println("The area of your circle is " + userRadius);
        }

        else {

            System.out.println("The area of your circle cannot be a negative value");
        }
    }

    public static double areaCircle (double radius) {

        return Math.PI * radius * radius;
    }
}
