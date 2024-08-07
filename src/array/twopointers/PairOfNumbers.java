package array.twopointers;

public class PairOfNumbers {
    public static void main(String[] args) {
        //works on sorted: first sort and then find index
        int[] arr = {1, 2, 3, 4, 6};
        int left = 0;
        int right = arr.length - 1;
        int target = 6;
        int[] pairs = pairs(arr, target, left, right);
        for (int i : pairs) {
            System.out.print(i + " ");
        }

        //bruteforce
        /*int[] s = new int[2];
        boolean f = false;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==target){
                    s[0]=arr[i];
                    s[1]=arr[j];
                    f = true;
                    break;
                }
            }
            if(f) break;
        }

        for (int w:s){
            System.out.print(w+" ");
        }*/

    }

    private static int[] pairs(int[] arr, int target, int left, int right) {
        while (left < right) {
            if (arr[left] + arr[right] == target) {
                return new int[]{left, right};
            }
            if (arr[left] + arr[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{-1, -1};
    }
}
