package recursion.basic;

public class NaturalSum {
    public static void main(String[] args) {
        int num = 10;
        int result = calculateSumOfNumbers(num);
        System.out.println(result);
    }

    private static int calculateSumOfNumbers(int num) {
        if (num == 0) return 0;
        int small = calculateSumOfNumbers(num - 1);
        int big = small + num;
        return big;
    }
}
