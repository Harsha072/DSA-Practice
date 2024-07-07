package Strings.Recursion;

public class Permutations {
    public static void main(String[] args) {
        String str = "abc";
        String res = "";
        permutate(res,str);
    }

    private static void permutate(String res, String str) {
        for (int i = 0; i <res.length()+1 ; i++) {
            res += str.charAt(i);
            permutate(res, str.substring(1));
        }
    }
}
