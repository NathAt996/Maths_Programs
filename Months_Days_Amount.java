import java.util.Scanner;

public class Months_Days_Amount {

    //Write a program that calculates how many days there were in a particular month and year

        public static void main(String[] args) {

            Scanner userInput = new Scanner (System.in);


            System.out.println("Enter an integer between 1-12 to represent the corresponding month");
            int month = userInput.nextInt();

            System.out.println("Enter a year");
            int year = userInput.nextInt();

            boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

            switch (month) {

                case 1 :
                    System.out.println("January " + year + " had 31 days");
                    break;


                case 2 :
                    if (isLeap == true) {

                        System.out.println("February " + year + " had 29 days");
                    }

                    else {

                        System.out.println("February " + year + " had 28 days");
                    }
                    break;


                case 3 :
                    System.out.println("March " + year + " had 31 days");
                    break;


                case 4 :
                    System.out.println("April " + year + " had 30 days");
                    break;


                case 5 :
                    System.out.println("May " + year + " had 31 days");
                    break;


                case 6 :
                    System.out.println("June " + year + " had 30 days");
                    break;


                case 7 :
                    System.out.println("July " + year + " had 31 days");
                    break;


                case 8 :
                    System.out.println("August " + year + " had 31 days");
                    break;


                case 9 :
                    System.out.println("September " + year + " had 30 days");
                    break;


                case 10 :
                    System.out.println("October " + year + " had 31 days");
                    break;


                case 11 :
                    System.out.println("November " + year + " had 30 days");
                    break;


                case 12 :
                    System.out.println("December " + year + " had 31 days");
                    break;
            }
        }
    }

