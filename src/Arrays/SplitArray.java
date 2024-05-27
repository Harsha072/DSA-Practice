package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SplitArray {
    public static void main(String[] args) {
        int [] a = {2,7,8,5,-1, 5, 6, -1, 8, 9};
        List<int[]> splitArrays = new ArrayList<>();
        int startIndex=0;
        int endIndex = 5;
      int [] subArray1 = new int[endIndex-startIndex];

        for (int i = startIndex; i <endIndex ; i++) {
             subArray1 [i] = a[i];
        }
        splitArrays.add(subArray1);
        startIndex = endIndex;
        endIndex = a.length;
        int [] subArray2 = new int[endIndex-startIndex];
        for (int i = startIndex; i<endIndex; i++) {

            subArray2[i - startIndex] = a[i];
        }
        splitArrays.add(subArray2);
        for (int [] ele:
             splitArrays) {
            for (int ele1:
                 ele) {
                System.out.println(ele1);
            }
        }
    }
}
