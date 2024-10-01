package exercise.array.basic;

public class SecondHighestElementOfAnArray {
    public static void main(String[] args) {
        int[] arr = {10, 11, 22, 1, -1, 221, 2};
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            }
            if (arr[i] > secondMax && arr[i] != firstMax) {
                secondMax = arr[i];
            }
        }

        System.out.println("Second Maximum Element in an array is : " + secondMax);
    }
}
