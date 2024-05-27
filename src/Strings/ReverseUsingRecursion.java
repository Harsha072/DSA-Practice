package Strings;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public class ReverseUsingRecursion {

    public static   String rev (String s, int i, String res){
        if(i<0){
            return res ;
        }
        res += s.charAt(i);
        return rev(s,i-1,res);
    }

    public static void main(String[] args) {
        String s = "hello";
        int i = s.length()-1;
        System.out.println(rev(s,i,""));
    }
}
