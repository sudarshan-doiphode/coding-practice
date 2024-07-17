package array.prefixsum;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        System.out.println("New prefixed array is : 😎 ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
