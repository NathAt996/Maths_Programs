import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.println("Enter the width of your first rectangle");
        double width = userInput.nextDouble();

        System.out.println("\nEnter the height of your first rectangle");
        double height = userInput.nextDouble();

        System.out.println("\nEnter the width of your second rectangle");
        double width2 = userInput.nextDouble();

        System.out.println("\nEnter the height of your second rectangle");
        double height2 = userInput.nextDouble();


        Rectangle_Obj rectangle1 = new Rectangle_Obj(width, height);
        Rectangle_Obj rectangle2 = new Rectangle_Obj(width2, height2);

        double area1 = rectangle1.getArea();
        double perimeter1 = rectangle1.getPerimeter();

        double area2 = rectangle2.getArea();
        double perimeter2 = rectangle2.getPerimeter();

        System.out.printf("\nArea of rectangle 1 = %.2f\n", area1);
        System.out.printf("Perimeter of rectangle 1 = %.2f\n", perimeter1);
        System.out.println("------------------------------------------");
        System.out.printf("\nArea of rectangle 2 = %.2f\n", area2);
        System.out.printf("Perimeter of rectangle 2 = %.2f\n", perimeter2);
    }
}
