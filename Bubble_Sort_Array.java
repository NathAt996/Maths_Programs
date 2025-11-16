import java.util.Arrays;
import java.util.Scanner;

public class Bubble_Sort_Array {

    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        //define number of elements in array
        System.out.println("Enter the number of elements");

        int players = userInput.nextInt();

        //Create array and pass through elements number defined
        int[] myArray = new int[players];

        //Enter user values
        System.out.println("Enter " + myArray.length + " values");

        //forLoop to allow user to enter the  values
        for(int i = 0; i < myArray.length; i++) {

            myArray[i] = userInput.nextInt();
        }


        //Pass through bubbleSort

        System.out.println("Original array : " + Arrays.toString(myArray));

        bubbleSort(myArray);

        System.out.println("Sorted array : " + Arrays.toString(myArray));

    }


    public static void bubbleSort (int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
