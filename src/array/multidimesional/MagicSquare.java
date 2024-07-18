package array.multidimesional;

public class MagicSquare {

    static boolean rowSum(int n, int[][] arr, int diagonalSum) {
        for (int row = 0; row < n; row++) {
            int sum = 0;
            for (int col = 0; col < n; col++) {
                sum += arr[row][col]; //0-0 , 0-1, 0-2, 1-0...
            }
            if (sum != diagonalSum) return false;
        }
        return true;
    }

    static boolean colSum(int n, int[][] arr, int diagonalSum) {
        for (int col = 0; col < n; col++) {
            int sum = 0;
            for (int row = 0; row < n; row++) {
                sum += arr[col][row]; //0-0 , 0-1, 0-2, 1-0...
            }
            if (sum != diagonalSum) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] arr = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        int n = 3;

        int d1 = firstDiagonalSum(n, arr);
        int d2 = secondDiagonalSum(n, arr);

        String result = result(n, arr, d1, d2);
        System.out.println(result);

    }

    private static String result(int n, int[][] arr, int d1, int d2) {
        if (d1 != d2) return "No";
        if (!rowSum(n, arr, d1)) return "No";
        if (!colSum(n, arr, d1)) return "No";
        return "Magic Square";
    }

    private static int secondDiagonalSum(int n, int[][] arr) {
        int row = 0;
        int col = n - 1;
        int d2 = 0;
        while (row < n && col >= 0) {
            d2 += arr[row][col];
            row++;
            col--;
        }
        return d2;
    }

    private static int firstDiagonalSum(int n, int[][] arr) {
        int d1 = 0, row = 0, col = 0;
        while (row < n && col < n) {
            d1 += arr[row][col]; //0-0 , 1-1, 2-2
            row++;
            col++;
        }
        return d1;
    }
}