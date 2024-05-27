package protect2;

import java.util.Scanner;


class NonZeroNumbers extends RuntimeException {

    NonZeroNumbers(String s){
        super(s);
    }


}
class MyCalculator2 {
    public int power(int n, int p) throws InterruptedException {

        if(n<0 || p<0){
            throw new InterruptedException(" n or p should not be negative");
        } else if (n==0 || p==0) {
            throw new InterruptedException(" n or p should not be zero");
        }
        else{
            return (int) Math.round(Math.pow(n,p));
        }

    }


}

public class Solution {
    public static final MyCalculator2 my_calculator = new MyCalculator2();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}