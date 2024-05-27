package Arrays;

import java.util.Arrays;

public class ArraysFill {
    public static void main(String[] args) {
        int [] a = new int[5];
        int value = 9;
        for (int i = 0; i <=a.length-1 ; i++) {
            a[i] = value;
        }
        for (int b: a) {
            System.out.println(b);
        }

    }
}
