package recursion.basic;

public class PrintName {

    static void printName(String name, int count) {
        if (count == 4) return;
        System.out.println(name);
        count++;
        printName(name, count);
    }

    public static void main(String[] args) {
        String name = "Darsh";
        int count = 1;
        printName(name, count);
    }
}
