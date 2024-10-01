package exercise.array.basic.crud;

import java.util.Scanner;

public class Create2DArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of an array: ");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
            System.out.println("Enter second row elements");
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
