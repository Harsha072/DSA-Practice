package Strings;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String myString = "   I    am a    wonderful String     !   ";
        String stringWithoutWhitespace = removeWhitespace(myString);
        System.out.println(stringWithoutWhitespace);
    }

    public static String removeWhitespace(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isWhitespace(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }
    }

