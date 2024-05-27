package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysRotate2 {
    public static List<Integer> rotLeft(List<Integer> a, int d) {
        List<Integer> resultant = null ;

        if(d<0){
            d= d+a.size();
        }
        else d = d % a.size();
    System.out.println(d);
        int[] numbers = a.stream().mapToInt(i -> i).toArray();
        for (int i = 1; i <=d; i++) {
            resultant=rotLeftOnce(numbers);
        }
        return resultant;
    }
    public static List<Integer> rotLeftOnce(int [] a) {
        int temp =  a[0];
        List <Integer> arr = null;
        for (int i = 1; i < a.length; i++) {
            a[i-1] =  a[i];
        }
        a[a.length-1] =temp;
        for (int b: a) {
            arr.add(b);
        }
        return arr ;
    }

    public static void main(String[] args) {
        List <Integer>  a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        int d = 4;
        List<Integer> result = ArraysRotate2.rotLeft(a, d);
        System.out.println(result);
    }
}
