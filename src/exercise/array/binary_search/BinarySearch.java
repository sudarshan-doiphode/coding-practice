package exercise.array.binary_search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = -1;
        int left = 0;
        int right = arr.length - 1;
        int index = getIndexOfTargetIfNotPresentReturnMinus1(arr, left, right, target);
        System.out.println("Index of target : " + target + " is :" + index);
    }

    private static int getIndexOfTargetIfNotPresentReturnMinus1(int[] arr, int left, int right, int target) {
        while (left <= right) {
            int mid = left + right / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            if (arr[mid] > target) right = mid - 1;
        }
        return -1;
    }
}
