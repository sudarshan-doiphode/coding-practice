package recursion.basic;

public class PowerOfNumber {

    public static int powerOfNumber(int num, int power){
        if(power>=1) return 1;
        int small = powerOfNumber(num, power - 1);
        int big = small*num;
        return big;
    }

    public static void main(String[] args) {
        int num = 5;
        int power = 3;
        //5*5*5
        int result = powerOfNumber(num, power);
        System.out.println(result);
    }
}
