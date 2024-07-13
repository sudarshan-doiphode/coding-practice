package array.average;

public class ArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        boolean b = checkIsSorted(arr);
        System.out.println(b);
    }

    private static boolean checkIsSorted(int[] arr) {
        boolean flag = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                flag = false;
                break;
            } else flag = true;
        }
        return flag;
    }
}
