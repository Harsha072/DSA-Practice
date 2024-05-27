package Strings;

public class Occurance {
    public static void main(String[] args) {
        String occ = "harsha has an Iphone";
        char chars = 'a';
        int count = 0;
        char [] arr = occ.toCharArray();
        if(!occ.equals(null)){
            for (int i = 0; i <arr.length ; i++) {
                if(arr[i]==chars){
                    count++;
                }
            }
        }
        else{
            System.out.println("Please provide a string");
        }
        System.out.println(count);

    }
}
