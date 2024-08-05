package array.basic;

public class CountOfNumbersLessThanMax {
    public static void main(String[] args) {
//        int[] arr = {1, 7, 3, 10, 11, 3, 2, 1};
        int[] arr = {7, 7, 7, 7, 7};
        int max = arr[0];
        int c = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                c++;
            }
            if (arr[i] < max) {
                c++;
            }
        }

        System.out.println(c);
    }
}
