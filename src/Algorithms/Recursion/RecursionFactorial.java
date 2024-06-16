package Algorithms.Recursion;

public class RecursionFactorial {

    private static int fact(int i) {
        if(i==1){
            return i;
        }
        System.out.println(i);
       return i* fact(i-1);

    }
    public static void main(String[] args) {
//        fact(5);
        System.out.println("So function got over print main method"+fact(5));
    }


}
