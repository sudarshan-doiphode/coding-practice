package exercise.array.basic.crud;

public class DeleteElementsFromAnArray {
    public static void main(String[] args) {
        int[] arr = {12, 2, 1, 211, 90};
        int index = 3;
        int[] ans = new int[arr.length-1];
        int j =0;
        for (int i = 0; i < arr.length; i++) {
            if(i<index){
                ans[j++] = arr[i];
            }
            if(i==index){
                continue;
            }
            if(i>index){
                ans[j++] = arr[i];
            }
        }

        for (int element: ans){
            System.out.print(element + " ");
        }
    }
}
