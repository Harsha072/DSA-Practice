package Arrays;

import java.util.Scanner;

public class NegativeSumSubArray {


        private static int countNegativeSubArray(String elements, String l) {
           String [] number;
           number = elements.split(" ");
            int sum = 0;
            int count =0;
           if(Integer.parseInt(l)!=0){
               int [] numbersArray = new int[Integer.parseInt(l)];
               for (int i = 0; i <number.length ; i++) {
                   numbersArray[i] = Integer.parseInt(number[i]);
               }
               for (int i = 0; i <numbersArray.length ; i++) {
                   for (int k = i; k <numbersArray.length ; k++) {
                       sum +=numbersArray[k] ;
                       if(sum<0){
                           count++;
                       }
                   }
                   sum =0;
               }
           }

 return  count;
        }

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

            Scanner sc = new Scanner(System.in);
            String length = sc.nextLine();
            String  elements = sc.nextLine();

            System.out.println(countNegativeSubArray(elements,length));
        }

}
