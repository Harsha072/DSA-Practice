package Algorithms.SelectionSort;

public class SelectionSortUsingRecursion {
    public static void main(String[] args) {
        int [] arr = {2,1,-9,0};
        int start = 0;
        int end = arr.length-1;

     int [] res =selectionSort(arr,start,end);
        for (int i = 0; i <res.length ; i++) {
            System.out.println(res[i]);
        }
    }

    private static int[] selectionSort(int[] arr,int start, int last) {
            if(last==0){
                return arr;
            }
            int maxIndex =findMaxIndex(arr,start,last);
            swap(arr,maxIndex,last);
            start = 0;
            last = last-1;
            return selectionSort(arr, start, last);
    }

    private static void swap(int[] arr, int maxIndex, int last) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }

    private static int findMaxIndex(int[] arr, int start, int last) {

        int max = start;
        for (int i = 0; i <=last ; i++) {
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
}
