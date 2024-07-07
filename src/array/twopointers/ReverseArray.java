package array.twopointers;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        reverseArray(arr, 0, arr.length - 1);
        System.out.print("Reversed array is 😎 : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void reverseArray(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
