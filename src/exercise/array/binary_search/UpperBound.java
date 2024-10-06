package exercise.array.binary_search;

public class UpperBound {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8};
        int target = 8;
        int low = 0;
        int high = arr.length - 1;
        int hb = arr.length;
        int index = getUpperBoundIndexForTarget(arr, low, high, target, hb);
        System.out.println("Index : " + index);
    }

    public static int getUpperBoundIndexForTarget(int[] arr, int low, int high, int target, int hb) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= target) low = mid + 1;
            if (arr[mid] > target) {
                hb = mid;
                high = mid - 1;
            }
        }
        return hb;
    }
}
