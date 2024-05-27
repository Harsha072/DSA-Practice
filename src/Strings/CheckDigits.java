package Strings;

import java.util.Scanner;

public class CheckDigits {

    public static String check(String s1){
        char[] digits = s1.toCharArray();
        int characterCount = 0;
        for (int i = 0; i < digits.length; i++) {
            if (!Character.isDigit(digits[i])) {
                characterCount++;
            }
        }
        if (characterCount > 0) {
            return "The string conatins characters and digits";
        } else {
            return   "The string conatins only digits";
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        System.out.println(check(s1));

    }
}
