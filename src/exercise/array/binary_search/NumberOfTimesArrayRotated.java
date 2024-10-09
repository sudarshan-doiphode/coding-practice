package exercise.array.binary_search;

public class NumberOfTimesArrayRotated {
    public static void main(String[] args) {
//        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int[] arr = {1, 2, 3};
        int low = 0;
        int n = arr.length;
        int high = arr.length - 1;
        int rotated = numberOfTimesArrayRotated(arr, low, high, n);
        System.out.println("The array is rotated :" + rotated + " times");
    }

    private static int numberOfTimesArrayRotated(int[] arr, int low, int high, int n) {
        int result = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > arr[n-1]) {
                low = mid + 1;
            } else if (arr[mid] <= arr[n-1]) {
                result = mid;
                high = mid - 1;
            }
        }
        return result;
    }
}
