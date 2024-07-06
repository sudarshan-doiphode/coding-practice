package array.average;

public class PairOfElements {
    public static void main(String[] args) {
        int[] arr = {4, 6, 5, 3, 8, 2};
        int element = 7;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==element){
                    System.out.println("Pair of elements to get target "+ element + " are "+arr[i] + " and " + arr[j]);
                }
            }
        }
    }
}
