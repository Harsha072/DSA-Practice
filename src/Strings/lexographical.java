package Strings;

public class lexographical {
    public static void main(String[] args) {
        String str1 = "Geeks";
        String str2 = "GeeksForGeeks";
        int result = compareLexicographically(str1, str2);
        if (result < 0) {
            System.out.println(str1 + " is lexicographically smaller than " + str2);
        } else if (result > 0) {
            System.out.println(str2 + " is lexicographically smaller than " + str1);
        } else {
            System.out.println("Both strings are lexicographically equal.");
        }

    }

    public static int compareLexicographically(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        for (int i = 0; i < minLength; i++) {
            System.out.println(str1.charAt(i)+" "+ str2.charAt(i));
            if (str1.charAt(i) != str2.charAt(i)) {
                return str1.charAt(i) - str2.charAt(i);
            }
        }
        return str1.length() - str2.length();
    }
}
