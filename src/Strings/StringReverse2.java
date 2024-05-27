package Strings;

import java.util.Scanner;

public class StringReverse2 {

    private static String testString(String input, char [] stringRev){
          String reversed = new String(stringRev);
          if(reversed.equalsIgnoreCase(input)){
              return "testcase passed";
          }
          else{
              return "testcase failed";
          }
    }
    public static void main(String[] args) {
        String rev = "harsha";
      char [] stringRev = rev.toCharArray();
      int i =0;
      int j = stringRev.length-1;
      while(i<j){
          char temp = stringRev[i];
          stringRev[i] = stringRev[j];
          stringRev[j] = temp;
          i++;
          j--;
      }
        for (char c:
             stringRev) {
            System.out.println(c);
        }

        System.out.println(testString("ahsrahw",stringRev));
    }
}
