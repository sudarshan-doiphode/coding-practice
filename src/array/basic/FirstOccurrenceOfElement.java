package array.basic;

public class FirstOccurrenceOfElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 51, 1};
        int element = 111;
        int index = firstOccurrence(arr, element);
        if (index == 1) {
            System.out.println(element + " first occurs at index " + index);
        } else {
            System.out.println("Element does not exist 👎");
        }
    }

    private static int firstOccurrence(int[] arr, int element) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }
        }
        return index;
    }
}
