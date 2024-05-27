package Strings;

public class Palindrome {
    public static void main(String[] args) {
        String palindrome = "madam";
        String revPalindrom="";
        char [] pal = palindrome.toCharArray();
        for (int i = pal.length-1; i>=0 ; i--) {
            revPalindrom+=pal[i];
        }
        System.out.println(revPalindrom);
        if(revPalindrom.equals(palindrome)){
            System.out.println("string is a palidrom");
        }
        else{
            System.out.println("string is not a palidrom");
        }
    }
}
