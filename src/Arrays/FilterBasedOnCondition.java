package Arrays;

import java.util.ArrayList;
import java.util.List;

public class FilterBasedOnCondition {
    public static void main(String[] args) {
        int [] a = {3};
        List<Integer> odd = new ArrayList();
        if(a.length>0) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 != 0) {
                    odd.add(a[i]);
                }
            }
            for (Integer a1 : odd) {
                System.out.println(a1);
            }
        }
        else{
            System.out.println("Array empty");
        }

    }
}
