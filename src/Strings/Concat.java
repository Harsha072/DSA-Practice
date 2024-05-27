package Strings;

public class Concat {

    public static void main(String[] args) {
        String s1 = "Hi";
        String s2 = "Hello";

        String s3 = "";
        char [] ch1 = s1.toCharArray();
        char [] ch2 = s2.toCharArray();
        for (int i = 0; i <ch1.length ; i++) {
            s3 +=String.valueOf(ch1[i]);
        }
        for (int j = 0;j<s2.length();j++){
            s3 +=String.valueOf(ch2[j]);
        }
        System.out.println(s3);

    }




}
