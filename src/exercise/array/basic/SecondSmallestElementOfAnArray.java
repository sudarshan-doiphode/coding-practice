package exercise.array.basic;

public class SecondSmallestElementOfAnArray {
    public static void main(String[] args) {
        int[] arr = {-11, -102, -200, -1000, 22, 21, 1};
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<firstMin){
                secondMin =firstMin;
                firstMin = arr[i];
            }
            if(arr[i]<secondMin && arr[i]!=firstMin){
                secondMin = arr[i];
            }
        }

        System.out.println("Second smallest element in an array: "+ secondMin);
    }
}
