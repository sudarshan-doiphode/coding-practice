package array.basic;

public class SecondSmallestElement {
    public static void main(String[] args) {
        int[] arr = {-122, 12, 45, -221, 31, 1};
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min1) {
                min2 = min1;
                min1 = arr[i];
            }
            if (arr[i] < min2 && arr[i] != min1) {
                min2 = arr[i];
            }
        }
        System.out.println("Second Smallest Value: " + min2);
    }
}
