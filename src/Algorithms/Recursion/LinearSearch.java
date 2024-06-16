package Algorithms.Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int [] a = {3,2,1,1,18,9,18};
        int target = 18;
        int i=0;
        System.out.println(search2(a,i,target));

    }

    private static int search(int[] a, int i, int target) {
        if(target==a[i]) return i;
       
        return search(a,i+1,target);
    }

    private static ArrayList<Integer> search2(int[] a, int i, int target) {
        ArrayList<Integer> list = new ArrayList<>();

        if(i==a.length) {
            return list;
        }

        if(a[i]==target){
            list.add(i);
        }


        ArrayList<Integer> belowCalls = search2(a,i+1,target);
        list.addAll(belowCalls);

        return  list;
    }
}
