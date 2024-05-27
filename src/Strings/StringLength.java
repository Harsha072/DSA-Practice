package Strings;

public class StringLength {
    public static void main(String[] args) {
        String res = "hello";

       char [] characters = res.toCharArray();
       int count = 0;
        for (char c: characters) {
            System.out.println(c);
            count++;

        }
System.out.println(count);
    }
}
