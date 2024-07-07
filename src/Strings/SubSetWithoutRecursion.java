package Strings;

import java.util.ArrayList;
import java.util.List;

public class SubSetWithoutRecursion {
    public static void main(String[] args) {
        String str = "abc";
        subsetWithoutRecursion(str);
    }

    private static void subsetWithoutRecursion(String str) {
        List<String> subsets = new ArrayList<>();

        // Add empty subset
        subsets.add("");

        // Iterate over each character in the string
        for (char ch : str.toCharArray()) {
            // Get current size of subsets list
            int size = subsets.size();

            // Add current character to each existing subset to create new subsets
            for (int i = 0; i < size; i++) {
                subsets.add(subsets.get(i) + ch);
            }
        }

        // Print all subsets
        for (String subset : subsets) {
            if (!subset.isEmpty()) {
                System.out.println(subset);
            }
        }
    }
}
