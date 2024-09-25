package exercise.array.basic.crud;

public class UpdateExistingElementOfAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int index = 3;
        int value = 10;
        for (int i = 0; i < arr.length; i++) {
            if (i < index) continue;
            if (i == index) arr[i] = value;
            if (i > index) continue;
        }

        for (int element: arr){
            System.out.print(element+ " ");
        }
    }
}
