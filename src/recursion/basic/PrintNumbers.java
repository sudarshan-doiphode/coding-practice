package recursion.basic;

public class PrintNumbers {
    public static void main(String[] args) {
        int num = 5;
        int num2 = 1;
        printNumberDecreasing(num);
        System.out.println();
        printNumberIncreasing(num2);
    }

    private static void printNumberIncreasing(int num) {
        if (num == 6) return;
        System.out.print(num + " ");
        printNumberIncreasing(num + 1);
    }

    public static void printNumberDecreasing(int num) {
        if (num == 0) return;
        System.out.print(num + " ");
        printNumberDecreasing(num - 1);
    }
}
