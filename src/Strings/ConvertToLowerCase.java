package Strings;

public class ConvertToLowerCase {
    public static  String toLowerCase(String str){
        if(str.equals(null)){
            throw  new NullPointerException("Please give string ");
        }
        else{
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] >= 'A' && chars[i] <= 'Z') {
                    chars[i] = (char) (chars[i] + 32); // Convert uppercase to lowercase
                }
            }
            return new String(chars);
        }

    }

    public static void main(String[] args) {
        String str = "harsha";
        System.out.println(toLowerCase(str));
    }
}
