package array.basic;

public class ThreeConsecutiveOdds {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1}; //true
        //{1,1,2,1} //false
        int count = 0;
        boolean result = isConsecutiveOdds(arr, count);
        System.out.println(result);
    }

    private static boolean isConsecutiveOdds(int[] arr, int count) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            } else {
                count = 0;
            }
            if (count == 3) {
                return true;
            }
        }
        return false;
    }
}
