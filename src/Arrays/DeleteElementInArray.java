package Arrays;

import java.util.Arrays;

public class DeleteElementInArray {
    public static void main(String[] args) {
        int [] a = {2,7,8,5,-1, 5, 6, -1, 8, 9};
        int [] b = {2,7,8,5,-1, 5, 6, -1, 8, 90};
        System.out.println(Arrays.equals(a,b));
        System.out.println(a==b);
//        int indexToDelete = -1;
//        int [] newArray = new int [a.length-1];
//
//        if(a.length>0 && indexToDelete>0) {
//            for (int i = 0, j = 0; i < a.length; i++) {
//                if (i == indexToDelete) {
//                    continue;
//                }
//                newArray[j++] = a[i];
//            }
//            for (int ele:
//                    newArray) {
//                System.out.println(ele);
//            }
//        }
//        else{
//            System.out.println("empty array or index not found");
//        }

    }

}
