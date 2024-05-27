package Strings;

public class StringReverse {

    public static void main(String[] args) {
        String rev = "harsha";
        String res ="";

        for (int i = rev.length()-1; i >=0 ; i--) {
            res+=rev.charAt(i);
        }
        System.out.println(res);
    }
}
