package Algorithms.QuickSort;

import java.util.Arrays;

public class QuickSort {

    /***
     * choose a random number or a middle number as a pivot or middle one.
     * the elements on the left of the pivot should be less than the pivot and elements on the right should be greater
     * **/
    public static void main(String[] args) {
        int [] a = {5,4,3,3,2,1};
        int low = 0;
        int high = a.length-1;
          quickSort(a, low, high);
          System.out.println(Arrays.toString(a));
    }

    private static void quickSort(int[] a, int low , int high) {
        if(low>=high) return;

        int start =low;
        int end = high;
        int mid= start+(end-1)/2;
         int pivot =a[mid];
            while(start<end){// if it is already sorted it wont swap. compared to merge sort
                while(a[start]<pivot){
                   start++;
                }
                while(a[end]>pivot){
                    end--;
                }
                if(start<=end)
                {int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                    start++;
                    end --;
                }

            }
            quickSort(a, low, end);
            quickSort(a, start, high);


    }
}
