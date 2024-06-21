package Algorithms.MergeSort;

import java.util.Arrays;

public class MergeSortInplace {
    public static void main(String[] args) {
        int [] a = {5,4,3,2,1};

        mergeSortInPlace(a,0, a.length);
        System.out.println(Arrays.toString(a));
    }

    private static void mergeSortInPlace(int[] a, int start, int end) {
        if(end-start==1){
            return;
        }
        int mid = (start+end)/2;

        mergeSortInPlace(a,start,mid);
        mergeSortInPlace(a,mid,end);

     mergeArray(a, start,mid, end);

    }
    private static void mergeArray(int [] arr , int start ,int mid, int end){
        int [] mix = new int[end-start];

        int i = start;
        int j= mid;
        int k=0 ;

        while (i<mid && j<end){
            if(arr[i]<arr[j]){
                mix[k] = arr[i];
                i++;
                k++;
            }
            else{
                mix[k] = arr[j];
                j++;
                k++;
            }
        }
        while (i<mid){
            mix[k] = arr[i];
            k++;
            i++;
        }
        while (j<end){
            mix[k] = arr[j];
            k++;
            j++;
        }
        for (int l = 0; l <mix.length ; l++) {
            arr[start+l] = mix[l];
        }

    }
}
