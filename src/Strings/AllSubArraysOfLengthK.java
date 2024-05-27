package Strings;

public class AllSubArraysOfLengthK {
    public static void main(String[] args) {
        String arr = "welcome";
        System.out.println(arr.substring(1,4));
        int k = 3;
        char [] a = arr.toCharArray();
        String substring = " ";
        for (int i = 0; i <k-1 ; i++) {
            substring += a[i];
        }
        for (int i = k; i <a.length-1 ; i++) {
           substring = substring.substring(1)+a[i];
          System.out.println(substring);
        }

    }
}
