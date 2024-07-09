package array.average;

public class CyclicRotationByKSteps {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 7;
        int n = arr.length;
        k = k % n; //2
        int j = 0;
        int[] updatedArray = new int[n];
        for (int i = n - k; i < n; i++) {
            updatedArray[j++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            updatedArray[j++] = arr[i];
        }
        for (int i : updatedArray) {
            System.out.print(i + " ");
        }

    }
}
