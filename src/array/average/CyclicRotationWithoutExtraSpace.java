package array.average;

public class CyclicRotationWithoutExtraSpace {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 7;
        int n = 5;
        k=k%n; //2
        reverseArrayValues(arr, 0, n-k-1);
        reverseArrayValues(arr, n-k, n-1);
        reverseArrayValues(arr, 0, n-1);
        System.out.println("After Rotation : 😎");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    private static void reverseArrayValues(int[] arr, int left, int right) {
        while(left<right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}
