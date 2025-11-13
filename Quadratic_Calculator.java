import java.util.Scanner;

public class Quadratic_Calculator {

    public static void main(String[] args)
    {
        Scanner userInput = new Scanner (System.in);


        //inputs
        System.out.println("Enter value for a");
        double a = userInput.nextDouble();

        System.out.println("Enter value for b");
        double b = userInput.nextDouble();

        System.out.println("Enter value for c");
        double c = userInput.nextDouble();

        System.out.println("a = " + a + "\nb = " + b + "\nc = " + c);

        System.out.println();
        


        //discriminant + calculate the result

        if (a == 0)
        {
            if (b == 0)
            {
                if (c == 0)
                {
                    System.out.println("Infinite solution , any x is a solution");
                }

                else
                {
                    System.out.println("No solution , constant term is non zero..");
                }
            }

            else
            {
                double x = -c / b;
                System.out.println("This is not a quadratic equation. Linear Solution : " + x);
            }
        }

        else
        {
            double discriminant = b * b - 4 * a * c;


            if (discriminant > 0)
            {
                System.out.println("Two solutions for x..");
                double resultPositive = quadraticPositive(a, b, discriminant);
                double resultNegative = quadraticNegative(a, b, discriminant);
                System.out.println("x1 = " + resultPositive + "\nx2 = " + resultNegative);


            }

            else if (discriminant == 0)
            {
                System.out.println("One solution for x");


                double resultPositive = quadraticPositive(a, b, discriminant);


                System.out.println("x = " + resultPositive);
            }

            else
            {
                System.out.println("No real number solutions");
            }
        }
    }


    //Quadratic formula

    public static double quadraticPositive(double a, double b, double discriminant)
    {
        return (-b + Math.sqrt(discriminant)) / (2 * a);
    }

    public static double quadraticNegative(double a, double b, double discriminant)
    {
        return (-b - Math.sqrt(discriminant)) / (2 * a);
    }
}
