import java.util.Scanner;

public class SumSeries {

    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.println("Enter a number for i");
        int i = userInput.nextInt();

        System.out.println(m(i));

    }

    public static double m(double i) {
        if (i == 1) {
            return 1.0 / 3.0;
        } else {
            return i / (2 * i + 1) + m(i - 1);
        }
    }
}
