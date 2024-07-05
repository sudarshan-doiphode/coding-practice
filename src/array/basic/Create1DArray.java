package array.basic;

import java.util.Scanner;

public class Create1DArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println("------------------");

        int[] arr2 = {1, 2, 3, 4, 5};
        int i = 0;
        while (i < arr2.length) {
            System.out.print(arr2[i] + " ");
            i++;
        }
    }
}
