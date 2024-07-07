package Strings.Recursion;

public class skipElement {
    /**
     * Input : bcabbca
     * Output : bcbbc
     *
     * */

    public static void main(String[] args) {
        String s = "This apple was bitter than apple";
        int i =0;
        String str="";
        System.out.println(skipString(s));

    }

    private static String skip(String s) {
        if(s.isEmpty()){
            return " ";
        }
        if(s.charAt(0)=='a'){
           return skip(s.substring(1));
        }
        else {
           return s.charAt(0)+skip(s.substring(1));
        }


    }
    private static String skipString(String s) {
        if(s.isEmpty()){

            return " ";
        }
        if(s.startsWith("apple")){
            return skipString(s.substring(1));
        }
        else {
           return  s+s.substring(0, s.indexOf(" "))+skipString(s.substring(0, s.indexOf(" ")));
        }


    }
}
