package array.basic;

public class CountNumberOfTimesNumberExist {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 1};
        int element = 1, count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                count++;
            }
        }
        System.out.println(element + " exists " + count + " times");

    }
}
