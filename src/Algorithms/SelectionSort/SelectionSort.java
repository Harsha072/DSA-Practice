package Algorithms.SelectionSort;


/**
First we have to choose the max element from the array and place it in its right position.
we have to find the max index element till length -1-i and swap it with the last element.
 Good for small data set
 */
public class SelectionSort {
    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int start = 0;
            int last = arr.length-1-i;
            int maxIndex = getMaxIndex(start,last,arr);
            swap(arr, maxIndex,last);
        }
        print(arr);
    }

    private static void print(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void swap(int[] arr, int maxIndex, int last) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }

    private static int getMaxIndex(int start, int last, int[] arr) {
        int max = start;
        for (int i = 0; i <=last ; i++) {
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] arr = {2,1,-9,0};
        selectionSort(arr);

    }


}
