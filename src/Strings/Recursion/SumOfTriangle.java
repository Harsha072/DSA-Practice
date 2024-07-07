package Strings.Recursion;

import java.util.Arrays;

public class SumOfTriangle {
    public static void main(String[] args) {
       int [] r = {1,2,3,4,5};
       sumOfTriangle(r);
    }

    private static void sumOfTriangle(int[] r) {
        if(r.length<1){
            return;
        }

        int [] temp = new int[r.length-1];
        for (int i = 0; i <temp.length ; i++) {
            int sum = r[i]+r[i+1];
            temp[i] = sum;
        }

        System.out.println(Arrays.toString(temp));

        sumOfTriangle(temp);
    }



}
