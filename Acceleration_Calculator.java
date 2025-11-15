import java.util.Scanner;

public class Acceleration_Calculator {

    public static void main(String[] args) {

        // Acceleration calculator

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter v0, v1 and t: ");


        double userInitial = userInput.nextDouble();
        double userFinal = userInput.nextDouble();
        double userTime = userInput.nextDouble();
        
        System.out.println("The average acceleration is " + acceleration(userInitial, userFinal, userTime));

    }

    public static double acceleration (double v0, double v1, double t)
    {
        return (v1 - v0) / t;
    }
}


