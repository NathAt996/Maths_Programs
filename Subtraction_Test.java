import java.util.Scanner;

public class Subtraction_Test {

    public static void main(String[] args) {
        
        int count = 0;
        int correctCount = 0;
        long startTime = System.currentTimeMillis();
        int Number_Of_Questions = 5;
        String output = " ";


        Scanner userInput = new Scanner (System.in);


        while (count < Number_Of_Questions) {

            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);


            System.out.println("What is " + number1 + " - " + number2 + " ?");

            int answer = userInput.nextInt();

            //answers

            if (number1 - number2 == answer) {

                System.out.println("Correct");
                correctCount ++;
            }


            else {

                System.out.println("Incorrect");
            }


            count ++;


            output += "\n" + number1 + " - " + number2 + " = " + answer + ((number1 - number2 == answer) ? " correct " : " incorrect");
        }

        long endTime = System.currentTimeMillis();
        long finalTime = (endTime - startTime) / 1000;

        System.out.println("You scored " + correctCount + " out of 5" + " in " + finalTime + " seconds" + output);

        System.out.println("\n");

        if (finalTime < 10 && correctCount == 5) {

            System.out.println("You win platinum!");
        }


        else if (finalTime == 10 && correctCount > 4) {

            System.out.println("You win gold!");
        }


        else if (finalTime < 15 && correctCount > 3) {

            System.out.println("You win silver!");
        }


        else if (finalTime < 20 && correctCount > 4) {

            System.out.println("You win bronze!");
        }


        else {

            System.out.println("You better practise your subtraction");
        }
    }
}
