package Exception;
import java.io.*;
import java.util.*;

class MyException extends RuntimeException{

    MyException(String s){
        super(s);
    }
}
class MyCalculator{
    public long power(int n, int p){
        if(n<0 || p<0){
            throw new MyException("java.lang.Exception: n and p should not be zero.");
        }
        else{
            long res = (long) Math.pow(n,p);
            return res;
        }

    }
}
public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String [] in = input.split(" ");
        MyCalculator cal = new MyCalculator();
        System.out.println(cal.power(Integer.parseInt(in[0]),Integer.parseInt(in[1])));
    }
}