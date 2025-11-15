import java.util.Scanner;

public class Compound_Interest {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Input a principle value");
        double principleValue = userInput.nextDouble();
        System.out.println("Input a compound interest % rate. Eg, type 5% as 1.05 etc ");
        double rate = userInput.nextDouble();
        double sum = 0;

        System.out.println("Your principle value from year 0 is : £" + principleValue);
        System.out.println();


        for(int i=1; i<=10; i++)
        {
            principleValue *= rate;
            System.out.printf("%3d. Year amount is £%.2f\n : ", i, principleValue);


            if (i > 10);

            sum += rate;
        }

        System.out.println();
        System.out.printf("After 10 years your initial investment is worth exactly \n : £%.2f", principleValue);

    }
}
