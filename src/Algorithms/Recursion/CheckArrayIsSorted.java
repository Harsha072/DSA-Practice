package Algorithms.Recursion;

public class CheckArrayIsSorted {
    public static void main(String[] args) {
        int [] a = {1,0};
        int i =0;
        System.out.println(checkSorted(a, i));
    }

    private static boolean checkSorted(int[] a, int i) {
        if(i == a.length-1){
            return true;
        } else if (a[i]<a[i+1] && checkSorted(a,i+1)) {
            return true;
        }

        return false;
    }

}
