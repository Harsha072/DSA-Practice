package Algorithms.binarySearch;

public class LargestLetter {
    public static void main(String[] args) {
        int [] a = {'a','b','c','e','f','g'};
        int target = 'd';
        int start = 0;
        int end = a.length-1;

        if(target>a[a.length-1]){
            System.out.println(-1);
        }
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
        System.out.println(Character.toString(a[start]));
    }
}
