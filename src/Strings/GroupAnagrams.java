package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams {
    private static boolean isAnagram(String str1, String str2){

        boolean anagram = true;
        char [] ch1 = str1.toCharArray();
        char [] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for (int i = 0; i < ch1.length ; i++) {
            if (ch1[i] != ch2[i]) {
               anagram = false;
                break;
            }

        }
     return anagram;
    }
    public static void main(String[] args) {
        String [] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<ArrayList<String>> anagramGroups = new ArrayList<>();
        ArrayList <String>group=null;
        for (int i = 0; i <input.length ; i++) {
            String s1 = input[i];
            group = new ArrayList<>();
            group.add(s1);
            for (int j = i+1; j <input.length ; j++) {
                if(isAnagram(s1,input[j])){
                    group.add(input[j]);
                }
            }
            anagramGroups.add(group);
        }
        for (ArrayList e:
             anagramGroups) {
            System.out.println(e);
        }

    }
}
