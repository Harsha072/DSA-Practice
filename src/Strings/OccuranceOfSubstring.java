package Strings;

public class OccuranceOfSubstring {
    public static void main(String[] args) {
        String str = "Hello, how are you?";
        String substring = "how";
        int index = -1;
        String [] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(substring)) {
                index = i;
                break; // Exit the loop once the first occurrence is found
            }
        }

        if (index != -1) {
            System.out.println("Index of '" + substring + "': " + index);
        } else {
            System.out.println("'" + substring + "' not found in the string.");
        }
        System.out.println(str.indexOf(substring));
        System.out.println(index);
    }
}
