import java.util.Scanner;

public class Car_Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.println("Enter number of miles");
        double miles = userInput.nextDouble();

        System.out.println("\nEnter number of gallons of gas used");
        double gas = userInput.nextDouble();

        Car_Obj car1 = new Car_Obj(miles, gas);

        double Fuel_Efficiency = car1.fuelEfficiency();

        System.out.printf("\nThe car's fuel efficiency is %.2f Miles Per Gallon.%n", Fuel_Efficiency);
    }
}
