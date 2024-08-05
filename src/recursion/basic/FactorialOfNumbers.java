package recursion.basic;

public class FactorialOfNumbers {
    public static void main(String[] args) {
        int num = 5;
        int factorial = factorial(num);
        System.out.println(factorial);
    }

    private static int factorial(int num) {
        if (num == 1) return 1;
        int small = factorial(num - 1);
        int big = small * num;
        return big;
    }
}
