package exercise.array.basic.crud;

public class InsertElementInBetweenOfAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 211, 32, 11, 24, -1};
        int index = 3;
        int value = 20;
        int j = 0;
        int[] ans = new int[arr.length + 1];
        for (int i = 0; i < ans.length; i++) {
            if(i<index){
                ans[j++] = arr[i];
            }
            if(i==index){
                ans[j++] = value;
            }
            if(i>index){
                ans[j++] = arr[i-1];
            }
        }

        for (int element: ans){
            System.out.print(element +"  ");
        }
    }
}
