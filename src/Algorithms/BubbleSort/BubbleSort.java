package Algorithms.BubbleSort;

public class BubbleSort {
    public static void main(String[] args) {
        int [] a = {5,4,3,2,1};
        bubbleSort(a);
    }/**
     what bubble sort usually does is it takes the largest element and places it in its position in 1st pass
     In second pass the second largest element is placed and so on.....
     **/

    private static void bubbleSort(int[] a) {
        boolean swap;
        for (int i = 0; i <a.length-1 ; i++) {
            swap = false;
            for (int j = 1; j <a.length-i ; j++) {
                if(a[j]<a[j-1]){
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                System.out.println("elements are sorted");
                break;
            }
        }

        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }


}
