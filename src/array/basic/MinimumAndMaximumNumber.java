package array.basic;

public class MinimumAndMaximumNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, -1, 55, 1, 22, 2};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);
    }
}
