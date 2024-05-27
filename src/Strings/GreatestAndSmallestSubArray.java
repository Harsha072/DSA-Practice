package Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GreatestAndSmallestSubArray {
    public static String getSmallestAndLargest(String s, int k) {
        char[] sub = s.toCharArray();
        String largest = "";
        String smallest = "";

        ArrayList<String> subArrays = new ArrayList<>();
        String sub1 = "";

        if (k < s.length()) {
            for (int i = 0; i <= k - 1; i++) {
                sub1 += sub[i];
            }
            subArrays.add(sub1);

            for (int i = k; i < sub.length; i++) {
                sub1 = sub1.substring(1) + sub[i];
                subArrays.add(sub1);
            }

            // Now you have all subarrays stored in subArrays ArrayList

            // You can find the largest and smallest strings from the ArrayList
            largest = subArrays.get(0);
            smallest = subArrays.get(0);

            for (String subArray : subArrays) {
                if (subArray.compareTo(largest) > 0) {
                    largest = subArray;
                }
                if (subArray.compareTo(smallest) < 0) {
                    smallest = subArray;
                }
            }

            return smallest + "\n" + largest;
        } else {
            return s;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        System.out.println(getSmallestAndLargest(s,k));
    }
}
