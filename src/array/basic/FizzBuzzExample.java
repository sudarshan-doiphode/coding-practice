package array.basic;

public class FizzBuzzExample {
    public static void main(String[] args) {
        int n=5;
        String [] ans=fizzBuzz(n);
        for(int i=0;i<ans.length;i++)
        {
            System.out.println(ans[i]);
        }
    }

    private static String[] fizzBuzz(int n) {
        String[] arr = new String[n];
        int j = 0;
        for (int i = 1; i <= n ; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                arr[j++] = "FizzBuzz";
            } else if (i % 3 == 0) {
                arr[j++] = "Fizz";
            } else if (i % 5 == 0) {
                arr[j++] = "Buzz";
            } else {
                arr[j++] = String.valueOf(i);
            }
        }
        return arr;
    }
}
