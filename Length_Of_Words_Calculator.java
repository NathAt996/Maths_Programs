import java.util.Scanner;

public class Length_Of_Words_Calculator {

    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.println("Enter a single word of your choosing");

        String message = FirstLetterCapitalise(userInput.nextLine());

        System.out.println("The number of letters in " + message + " is " + message.length());
    }

    public static String FirstLetterCapitalise (String str) {

        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
