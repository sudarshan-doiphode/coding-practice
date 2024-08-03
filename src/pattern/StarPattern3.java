package pattern;

public class StarPattern3 {
    public static void main(String[] args) {
        //* * * * *
        //* * * *
        //* * *
        //* *
        //*
        int n = 5;
        int counter = 5;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col < counter; col++) {
                System.out.print("* ");
            }
            counter--;
            System.out.println();
        }
    }
}
