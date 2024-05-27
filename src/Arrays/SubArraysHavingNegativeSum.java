package Arrays;

import java.util.Scanner;

public class SubArraysHavingNegativeSum {

    private static int countNegativeSubArray(String elements, String l) {
        int sum=0;
        int count=0;

        int length = Integer.parseInt(l);
        if(length>0 && elements != null){
            int [] array = new int[length];
            String [] arr = elements.split(" ");
            //converting string to int
            for (int i = 0; i <arr.length ; i++) {
                array[i] = Integer.parseInt(arr[i]);
            }

            //find all sub array
            for(int i = 0;i<=array.length-1;i++){
                for (int j = i; j <=array.length-1 ; j++) {
                    sum += array[j];

                    if(sum<0){
                        System.out.println(sum);
                        count++;
                    }
                }
                sum=0;
            }
            System.out.println(count);

        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String length = sc.nextLine();
        String  elements = sc.nextLine();

        countNegativeSubArray(elements,length);
//        countNegativeSubArray("1 -2 4 -5 1","5");
    }


}
