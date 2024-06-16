package Algorithms.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int [] a ={1,2,3,4,5,6};
        //check if arrays is empty or sorted
        int element = 5;
        int start = 0;
        int end = a.length-1;


        while (start<end){
            int mid = start+(end-start)/2;
            if(a[mid]==element){
                System.out.println(mid);
                break;

            } else if (element<a[mid]) {
                end = mid-1;

            } else if (element>a[mid]) {
                start = mid+1;

            }
            else{
                System.out.println("Not found");
            }
        }

    }
}
