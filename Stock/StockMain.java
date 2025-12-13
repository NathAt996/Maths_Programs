package Stock;

import java.util.Scanner;

public class StockMain {

    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.println("Enter stock symbol");
        String symbol = userInput.nextLine();

        System.out.println("\nEnter name of stock");
        String name = userInput.nextLine();

        System.out.println("\nWhat was the previous value?");
        double previousValue = userInput.nextDouble();

        System.out.println("\nWhat is the current value?");
        double currentValue = userInput.nextDouble();

        StockApplied stock = new StockApplied(symbol, name, previousValue, currentValue);

        System.out.println(STR."Stock price percentage change : \{stock.getChangePercentage()}%");
    }
}
