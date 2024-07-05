package array.basic;

public class InsertElementInBetween {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int element = 3;
        int index = 2;
        int[] updatedArray = new int[arr.length + 1];
        for (int i = 0; i < updatedArray.length; i++) {
            if (i < index) {
                updatedArray[i] = arr[i];
            }
            if (i == index) {
                updatedArray[i] = element;
            }
            if (i > index) {
                updatedArray[i] = arr[i - 1];
            }
        }

        for (int e : updatedArray) {
            System.out.print(e + " ");
        }
    }
}
