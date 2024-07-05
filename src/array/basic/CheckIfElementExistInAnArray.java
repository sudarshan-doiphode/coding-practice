package array.basic;

public class CheckIfElementExistInAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int element = 4;
        boolean b = checkElementExist(arr, element);
        if (b) {
            System.out.println("Element " + element + " exist in an array");
        } else {
            System.out.println("Element " + element + " does not exist");
        }
    }

    private static boolean checkElementExist(int[] arr, int element) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println("Index :"+ i);
                flag = true;
                break;
            }
        }
        return flag;
    }
}
