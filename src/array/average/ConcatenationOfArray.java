package array.average;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        //example: [1, 2, 1] ==> [1,2,1,1,2,1];
        int[] arr = {1, 2, 1};
        int n = arr.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = arr[i];   // 1 2 1
            ans[i + n] = arr[i];  // 1 2 1
        }

        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}


//note: for first you have to copy same array in first half of ans and then in second half copy same.