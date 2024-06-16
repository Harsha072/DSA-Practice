package Algorithms.Recursion;

public class BinarySearch {

    private static int search(int[] a, int start, int end, int target) {
        int mid = start +(end-start)/2;
        if(start>end) return -1;
        if(target<a[mid]){
          return search(a,start, mid-1, target);
        } else if (target>a[mid]) {
            return search(a,mid+1, end, target);
        }
        else return mid;
    }
    public static void main(String[] args) {

        int [] a ={1,2,3,4,5,6};
        //check if arrays is empty or sorted
        int target = 22;
        int start = 0;
        int end = a.length-1;
        System.out.println(search(a,start,end,target));

    }


}
