package array.basic;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {122, 12, 45, 221, 31, 1};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            }
            if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            }
        }
        System.out.println("Second Maximum is :" + max2);
    }
}
