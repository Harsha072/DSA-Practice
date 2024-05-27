package Recursion;



public class ReverseString {

    private static String reverseRecursion(char[] a, int length, String res) {
        if(length==0){
            return res;
        }
        length=length-1;
       res  +=Character.toString(a[length]);
       return reverseRecursion(a,length, res);
    }
    public static void main(String[] args) {
        char [] a = {'h','e','l','l','o'};
        String res = "";
       System.out.println(reverseRecursion(a,a.length,res));
    }


}
