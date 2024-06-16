package Algorithms.InsertionSort;

/**
Used for partially sorted array
 First sort till index number 1 tgen sort till index number 2 then sort till index 3 and so on.....
**/
public class InsertionSort {
    private static void insertionSrt(int[] a) {
        for (int i = 0; i <a.length-1 ; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(a[j]<a[j-1]){
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
                else break;
            }
        }
    }
    public static void main(String[] args) {
        int [] a = {5,3,4,4,1,2};
        insertionSrt(a);
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }


}
