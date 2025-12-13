package Rectangle;

import java.util.Scanner;

public class MainRectangle {

    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.println("Enter width");
        double width = userInput.nextDouble();

        System.out.println("Enter height");
        double height = userInput.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println("Area = " + rectangle.getArea());

        userInput.close();

    }
}
