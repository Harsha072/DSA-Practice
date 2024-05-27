package Strings;

public class CapitaliseFirstLetter {
    public static void main(String[] args) {
        String str = "i love my dog";
        StringBuilder result = new StringBuilder();

        boolean capitalizeNext = true;

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // Capitalize the character if it's the first character of a word
//            if (Character.isWhitespace(c)) {
//                capitalizeNext = true;
//            } else if (capitalizeNext) {
//                c = Character.toUpperCase(c);
//                capitalizeNext = false;
//            }
            if (c==' ') {
                capitalizeNext = true;
            } else if (capitalizeNext) {
                if (c >= 'a' && c <= 'z') {
                    c = (char) (c-32);
                }

                capitalizeNext = false;
            }

            // Append the character to the result
            result.append(c);
        }

        // Print the resulting string
        System.out.println(result.toString()); // Output: I Love My Dog
    }
}
