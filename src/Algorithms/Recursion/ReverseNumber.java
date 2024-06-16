package Algorithms.Recursion;

public class ReverseNumber {
    private static int reverseRecursion(String n, int length, String res) {

           if(length == 0){
               res += n.charAt(length);
               return Integer.parseInt(res);
           }
           res += n.charAt(length);
           length = length-1;

           return reverseRecursion(n, length, res);
    }
    public static void main(String[] args) {
        int number  = 1234;
        String res="";
        System.out.println(reverseRecursion(String.valueOf(number),String.valueOf(number).length()-1,res ));
    }


}
