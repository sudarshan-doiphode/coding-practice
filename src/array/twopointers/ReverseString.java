package array.twopointers;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String s = "hello";
        char[] arr = s.toCharArray();
        reverseString(arr, 0, arr.length-1);
        for (char c: arr){
            System.out.print(c+" ");
        }
    }

    private static void reverseString(char[] arr, int left, int right) {
        while (left<right){
            char temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}
