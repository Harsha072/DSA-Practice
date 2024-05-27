package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram2 {
//    static boolean isAnagram(String str1, String str2) {
//        if (str1.length() != str2.length()) {
//            return false; // Anagrams must have the same length
//        }
//
//        // Convert strings to char arrays
//        char[] a = str1.toCharArray();
//        char[] b = str2.toCharArray();
//
//        // Array to store character counts
//        int[] countA = new int[256]; // Assuming ASCII characters
//        int[] countB = new int[256]; // Assuming ASCII characters
//
//        // Count occurrences of characters in str1
//        for (char c : a) {
//            System.out.println("before "+countA[c]);
//            countA[c]++;
//            System.out.println("after "+countA[c]);
//        }
//
//        // Count occurrences of characters in str2
//        for (char c : b) {
//            System.out.println("before "+countB[c]);
//            countB[c]++;
//            System.out.println("after "+countB[c]);
//
//        }
//
//        // Compare the counts of characters
//        for (int i = 0; i < 256; i++) {
//            if (countA[i] != countB[i]) {
//                return false;
//            }
//        }
//
//        return true;
//    }



    static boolean isAnagram(String str1, String str2) {



        if (str1.length() != str2.length()) {
            return false; // Anagrams must have the same length
        }

        // Convert strings to char arrays and sort them
        char [] a = str1.toCharArray();
        char [] b = str2.toCharArray();


        HashMap<Character,Integer> hashMapA = new HashMap<>();
        HashMap<Character,Integer> hashMapB = new HashMap<>();
        for (int i = 0; i <a.length-1 ; i++) {
            hashMapA.put(a[i],hashMapA.getOrDefault(a[i],0)+1);
        }
        for (Map.Entry<Character, Integer> entry : hashMapA.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        for (int i = 0; i <b.length-1 ; i++) {
            hashMapB.put(b[i],hashMapB.getOrDefault(b[i],0)+1);
        }
        for (Map.Entry<Character, Integer> entry : hashMapB.entrySet()) {
            System.out.println("KeyB: " + entry.getKey() + ", ValueB: " + entry.getValue());
        }

        for (Map.Entry<Character, Integer> entry : hashMapA.entrySet()) {
            Character letter = entry.getKey();
            Integer  letterCountA = entry.getValue();
            if(hashMapB.containsKey(letter)){
                Integer letterCountB = hashMapB.get(letter);
                if(!letterCountA.equals(letterCountB)){
                    return  false;
                }
            }

        }
        return true;
        // Compare sorted strings

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
