package Algorithms.BubbleSort;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int [] a = {5,4,3,2,1};
        bubbleSort(a,1, a.length);
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }

    private static void bubbleSort(int[] a, int j, int length) {
        if (length == 1) {
            return;
        }
        if(j==length){
            bubbleSort(a,1,length-1);
            return;
        }
        if(a[j]<a[j-1]){
            int temp = a[j];
            a[j] = a[j-1];
            a[j-1] = temp;

        }
        bubbleSort(a,j+1,length);

    }
}
