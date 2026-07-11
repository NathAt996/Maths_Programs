import java.util.Scanner;

public class Zeller {

    public static void main(String[] args) {

        System.out.println("\nZeller’s congruence is an algorithm developed by\n" +
                "Christian Zeller to calculate the day of the week.");

        Scanner userInput = new Scanner(System.in);

        System.out.println("\nEnter year");
        int year = userInput.nextInt();

        System.out.println("\nEnter month (1-12) eg, January = 1");
        int m = userInput.nextInt();

        System.out.println("\nEnter the day of the month (1-31)");
        int q = userInput.nextInt();

        if (m == 1 || m == 2) {
            m += 12;
            year -= 1;
        }

        int j = century(year);
        int k = yearOfCentury(year);


        int day = Zeller(q, m, k, j);

        System.out.println("\nThe day of the week is: ");

        switch (day) {
            case 0:
                System.out.println("Saturday");
                break;

            case 1:
                System.out.println("Sunday");
                break;

            case 2:
                System.out.println("Monday");
                break;

            case 3:
                System.out.println("Tuesday");
                break;

            case 4:
                System.out.println("Wednesday");
                break;

            case 5:
                System.out.println("Thursday");
                break;

            case 6:
                System.out.println("Friday");
            }

            userInput.close();
        }


    public static int century (int year) {
        return year / 100;
    }

    public static int yearOfCentury (int year) {
        return year % 100;
    }


    public static int Zeller (int q, int m, int k, int j) {
        return (q + (26 * (m + 1) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

    }
}
