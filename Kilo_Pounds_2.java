public class Kilo_Pounds_2 {

    public static void main(String[] args) {

            System.out.printf("%-12s%-10s | %-10s%-12s%n", "Kilograms", "Pounds", "Pounds", "Kilogram");


            int kilo = 1;
            int pounds = 20;


            while (kilo <= 199 && pounds <= 515) {

                double toPounds = kilo * 2.205;
                double toKilos = pounds * 0.453;


                System.out.printf("%-12d%-10.2f | %-10d%-12.2s%n", kilo, toPounds, pounds, toKilos);

                kilo += 2;
                pounds += 5;

        }
    }
}
