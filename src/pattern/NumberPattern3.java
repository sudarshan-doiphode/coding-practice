package pattern;

public class NumberPattern3 {
    public static void main(String[] args) {
        //1 2 3 4 5
        //1 2 3 4
        //1 2 3
        //1 2
        //1
        int n = 5;
        int counter = n+1;
        for (int row = 1; row <= n + 1; row++) {
            for (int col = 1; col < counter; col++) {
                System.out.print(col+ " ");
            }
            counter--;
            System.out.println();
        }
    }
}
