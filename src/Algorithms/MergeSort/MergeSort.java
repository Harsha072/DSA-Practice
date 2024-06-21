package Algorithms.MergeSort;

import java.util.Arrays;

/**divide the array into half which is left and right and untill array.length
 * becomes 1 and then while returning
 * the array compare the left part and right part and insert each element into new array and then return the new array
 * */

public class MergeSort {
    public static void main(String[] args) {
        int [] a = {5,4,3,2,1};

       int [] res = mergeSort(a);
        for (int i = 0; i <res.length ; i++) {
            System.out.println(res[i]);
        }
    }

    private static int [] mergeSort(int[] a) {
        if(a.length==1){
            return a;
        }
        int mid = a.length/2;

        int [] left = mergeSort(Arrays.copyOfRange(a,0,mid));
        int [] right = mergeSort(Arrays.copyOfRange(a,mid,a.length));

        return merger(left,right);
    }

    private static int[] merger(int[] left, int[] right) {
        int [] mix = new int[left.length+right.length];

        int i = 0;
        int j=0;
        int k = 0;

        while (i<left.length && j<right.length){
            if(left[i]<right[j]){
                mix[k] = left[i];
                i++;
                k++;
            }
            else{
                mix[k] = right[j];
                j++;
                k++;
            }
        }
        while (i<left.length){
            mix[k] = left[i];
            k++;
            i++;
        }
        while (j<right.length){
            mix[k] = right[j];
            k++;
            j++;
        }
        return mix;
    }
}
