package exercise.array.basic.crud;

import java.util.Arrays;
import java.util.Scanner;

public class Create1DArray {
    public static void main(String[] args) {
        /*Approach 1*/
        int[] arr = {12, 11, 10, 9, 8, 7};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("********************************************");

        /*Approach 2*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of the array :" );
        int size = scanner.nextInt();
        int[] userArray = new int[size];
        System.out.println();
        System.out.println("Please enter the elements of an array : ");
        for (int i = 0; i < userArray.length; i++) {
            userArray[i] = scanner.nextInt();
        }

        System.out.println("*******************************");

        Arrays.stream(userArray).forEach(value -> System.out.print(value+ " "));

    }
}
