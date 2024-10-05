package exercise.array.binary_search;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10, 11};
        int lb = arr.length;
        int low = 0;
        int high = arr.length - 1;
        int target = 12;
        int index = getLowerBoundIndexForTarget(arr, low, high, target, lb);
        System.out.println("Index of target can be inserted: " + index);
    }

    public static int getLowerBoundIndexForTarget(int[] arr, int low, int high, int target, int lb) {
        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<target) low = mid+1;
            if(arr[mid]>=target) {
                lb = mid;
                high = mid-1;
            }
        }
        return lb;
    }
}
