package Algorithms.Recursion;

public class ReverseNumberWithoutConverting {
    private static int reverseRecursion(String n, int length, String res) {

           if(length == 0){
               res += getRes(n, length);
               return Integer.parseInt(res);
           }
           res += getRes(n, length);
           length = length-1;

           return reverseRecursion(n, length, res);
    }

    private static char getRes(String n, int length) {
        return n.charAt(length);
    }

    public static void main(String[] args) {
        int number  = 1234;
        String res="";
        System.out.println(reverseRecursion(String.valueOf(number),String.valueOf(number).length()-1,res ));
    }


}
