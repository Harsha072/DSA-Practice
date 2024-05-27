package Strings;

public class NumberOfVowels {


    public static void main(String[] args) {
        String res = "hello my name is harsha";
        char [] chars = res.toCharArray();
        int ij = Integer.valueOf("10");
        System.out.println(ij);
        int count = 0;
        if(!res.equals(null)){
            for (int i = 0; i <chars.length ; i++) {
                if(chars[i] == 'a'|| chars[i] == 'e'||chars[i] == 'o'||chars[i] == 'i'||chars[i] == 'u'){
                    count++;
                }
            }
        }
        else{
            System.out.println("Please enter a string");
        }
        System.out.println(count);


    }
}
