package array.basic;

public class LastOccurrenceOfElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 0};
        int element = 100;
        int index = lastOccurrenceOfElement(arr, element);
        if (index != -1) {
            System.out.println(element + " last occurs at index " + index);
        } else {
            System.out.println("Element does not exist 👎");
        }
    }

    private static int lastOccurrenceOfElement(int[] arr, int element) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;
            }
        }
        return index;
    }
}
