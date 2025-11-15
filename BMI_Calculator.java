import java.util.Scanner;

public class BMI_Calculator {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your weight in lbs");
        double weight = userInput.nextDouble();

        System.out.println("Enter your height in inches");
        double height = userInput.nextDouble();

        double userWeight = weightConversion(weight);
        double userHeight = heightConversion(height);
        double userBMI = BMI(userWeight, userHeight);


        System.out.println("Your BMI is : " + userBMI);


        if (userBMI < 18.5) {
            System.out.println("You are underweight");
        }

        else if (userBMI <= 25) {
            System.out.println("You are normal weight");
        }

        else if (userBMI <= 30) {
            System.out.println("You are overweight");
        }

        else {
            System.out.println("You are obese");
        }
    }


    public static double weightConversion(double lbs) {
        return lbs / 2.205;
    }

    public static double heightConversion(double inches) {
        return inches / 39.37;
    }

    public static double BMI(double kg, double m) {
        return kg / (m * m);

    }
}