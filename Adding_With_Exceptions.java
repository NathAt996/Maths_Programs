import java.util.InputMismatchException;
import java.util.Scanner;

public class Adding_With_Exceptions {

    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        try {

          System.out.println("Enter integer x");
          int numberX = userInput.nextInt();

          System.out.println("\nEnter integer y");
          int numberY = userInput.nextInt();

          double result = numberX / numberY;

          System.out.println("Answer: " + result);

        } catch (ArithmeticException e) {
            System.out.println("You can't divide by 0");
        }

        catch (InputMismatchException e) {
            System.out.println("You must input an integer");
        }

        catch (RuntimeException e) {
            throw new RuntimeException();
        }

        finally {
            userInput.close();
        }
    }
}
