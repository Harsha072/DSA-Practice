package Arrays;

import java.util.Arrays;

public class ArraysCopyOf {

    private static int [] copyOf(int [] original, int length){
        int [] newArray = new int[length];
        for (int i = 0; i <=original.length-1 ; i++) {
            newArray[i] = original[i];
        }
        return newArray;
    }
    public static void main(String[] args) {
        int [] original = {1,2,3,3,3,5};

        copyOf(original,original.length);



    }

}
