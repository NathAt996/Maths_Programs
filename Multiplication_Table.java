public class Multiplication_Table {

    public static void main(String[] args) {

        System.out.println("\n            Multiplication  Table");
        System.out.println();

        for (int i = 1; i <= 12; i++) {

            for (int j = 1; j <= 12; j++) {

                System.out.printf("%4d", i * j); //Display result and format as a block (if was println it would be all going down
            }

            System.out.println();
        }
    }
}
