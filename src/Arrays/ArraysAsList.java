package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ArraysAsList {
    public static void main(String[] args) {
        //aslist ius only used for Integer type of object.
        Integer [] a = {1, 2, 3, 4, 5};
        List<Integer> l = Arrays.asList(a);
        System.out.println(l.indexOf(4));
    }
}
