import java.util.Scanner;

public class Sum_Of_Integers {

        public static void main(String[] args) {

            Scanner userInput = new Scanner(System.in);


            System.out.println("Sentinel value == 0");
            System.out.println();
            String dataInput = "Input an integer. Hit zero to exit program";


            System.out.println(dataInput);
            int data = userInput.nextInt();
            int sum = 0;


            while (data != 0) {

                sum += data;
                System.out.println(dataInput);
                data = userInput.nextInt();
            }

            System.out.println("The sum total is " + sum);
        }
    }
