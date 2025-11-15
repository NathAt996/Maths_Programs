import java.util.Scanner;

public class Addition_Test {

    public static void main(String[] args) {

        final int Number_Of_Questions = 5;
        int count = 0;
        int correctCount = 0;
        long startTime = System.currentTimeMillis();
        String output = " ";
        Scanner userInput = new Scanner (System.in);


        while (count < Number_Of_Questions) {

            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);

            System.out.println("What is " + number1 + " + " + number2 + " ?");

            int answer = userInput.nextInt();

            if (number1 + number2 == answer) {

                System.out.println("Correct!");
                correctCount ++;
            }


            else {

                System.out.println("Incorrect");
            }

            count ++;

            output += "\n" + number1 + " + " + number2 + " = " + answer + ((number1 + number2 == answer) ? " correct" : " wrong");
        }

        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("\nCorrect count is " + correctCount + " out of 5" + "\nTest time is " + testTime / 1000 + " seconds\n" + output);
    }
}
