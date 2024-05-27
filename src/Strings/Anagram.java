package Strings;

import java.util.Arrays;


//again
public class Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean anagram = true;
        char [] ch1 = str1.toCharArray();
        char [] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for (int i = 0; i < ch1.length - 1; i++) {
            if (ch1[i] != ch2[i]) {
                anagram = false;
            }

        }

        System.out.println(anagram);
    }
}
