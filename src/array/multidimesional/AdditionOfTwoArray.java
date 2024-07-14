package array.multidimesional;

public class AdditionOfTwoArray {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2}, {3, 4}};
        int[][] arr2 = {{1, 2}, {3, 4}};

        // In addition, rows==columns
        int[][] ans = new int[arr1.length][arr1[0].length];
        additionOfArray(arr1, ans, arr2);
    }

    private static void additionOfArray(int[][] arr1, int[][] ans, int[][] arr2) {
        if(arr1.length!=arr2.length || arr1[0].length!=arr2[0].length){
            System.out.println("Wrong input addition not possible");
            return;
        }
        else {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[i].length; j++) {
                    ans[i][j] = arr1[i][j] + arr2[i][j];
                }
            }

            for (int i = 0; i < ans.length; i++) {
                for (int j = 0; j < ans[i].length; j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
