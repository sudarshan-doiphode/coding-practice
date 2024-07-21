package basic;

import java.util.ArrayList;
import java.util.List;

public class FactorsOfNumber {
    public static void main(String[] args) {
        int num = 16;
        List<Integer> list = new ArrayList<>();
        int sqrt = (int) Math.sqrt(num);
        for (int i = 1; i <= sqrt; i++) {
            if (num % i == 0) {
                list.add(i);
                if (i != num / i) {
                    list.add(num / i);
                }
            }
        }
        list.stream().sorted().forEach(System.out::println);
    }
}


/*Initialize an empty list to store factors.
Iterate from 1 to the square root of the number.
For each i, check if number % i == 0. If true, i is a factor.
Add both i and number / i to the list of factors if they are different.
return sorted list of factors for a clean output.*/
