package Algorithms.binarySearch;

public class SmallestLetter {
    public static void main(String[] args) {
        int [] a = {2,3,5,6,8,9};
        int target = 1;
        int start = 0;
        int end = a.length-1;


        while(start<=end){
            int mid = start+(end-start)/2;
            if(a[mid]==target){
                System.out.println(a[mid]);
            } else if (target<a[mid]) {
                end = mid-1;

            } else if (target>a[mid]) {
                start = mid+1;

            }

        }
        System.out.println(a[end]);
    }
    }

