package array.basic;

public class DeleteElementFromAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 4};
        int index = 3;
        int[] updatedArray = new int[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (i < index) {
                updatedArray[i] = arr[i];
            }
            if (i == index) {
                continue;
            }
            if (i > index) {
                updatedArray[i - 1] = arr[i];
            }
        }

        for (int i : updatedArray) {
            System.out.print(i + " ");
        }
    }
}
