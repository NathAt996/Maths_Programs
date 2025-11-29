import java.util.Scanner;

public class Cross_Vectors {

    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.println("Lets find the cross product of two vectors");

        System.out.println("\nEnter an i, j and k value for the first vector");

        double i1 = userInput.nextDouble();
        double j1 = userInput.nextDouble();
        double k1 = userInput.nextDouble();

        System.out.println("\nEnter an i, j and k value for the second vector");

        double i2 = userInput.nextDouble();
        double j2 = userInput.nextDouble();
        double k2 = userInput.nextDouble();

        int row = 2;
        int col = 3;

        double [][] matrix = new double [row][col];

        matrix[0][0] = i1;
        matrix[0][1] = j1;
        matrix[0][2] = k1;

        matrix[1][0] = i2;
        matrix[1][1] = j2;
        matrix[1][2] = k2;

        System.out.println("\n-----  Matrix  -----");
        System.out.println("i       j       k");

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                System.out.printf("%4.2f\t", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nVector A : <" +
                        i1 + " , " +
                        j1 + " , " +
                        k1 + ">");

        System.out.println("Vector B : <" +
                i2 + " , " +
                j2 + " , " +
                k2 + ">");

        double res_i = New_Vector_i(j1, k1, j2, k2);
        double res_j = New_Vector_j(i1, k1, i2, k2);
        double res_k = New_Vector_k(i1, j1, i2, j2);


        System.out.println("\nThe vector cross product = <" +
                res_i + " , " +
                res_j + " , " +
                res_k + ">" );

    }

    public static double New_Vector_i (double j1, double k1, double j2, double k2){

        return (j1 * k2) - (k1 * j2);
    }

    public static double New_Vector_j (double i1, double k1, double i2, double k2){

        return (i1 * k2) - (k1 * i2);
    }

    public static double New_Vector_k (double i1, double j1, double i2, double j2){

        return (i1 * j2) - (j1 * i2);
    }

}


