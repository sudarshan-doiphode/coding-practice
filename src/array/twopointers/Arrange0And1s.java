package array.twopointers;

public class Arrange0And1s {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 0, 1, 0, 0};
        sortArray(arr, 0, arr.length - 1);
        System.out.print("Sorted Array is : 😁 ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void sortArray(int[] arr, int left, int right) {
        while (left < right) {
            if (arr[left] == 0) {
                left++;
            }
            if (arr[right] == 1) {
                right--;
            }
            if (arr[left] == 1 && arr[right] == 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}
