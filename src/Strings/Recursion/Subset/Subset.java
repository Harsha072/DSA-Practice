package Strings.Recursion.Subset;


import java.util.ArrayList;
import java.util.List;

/**
 * taking any number of elements that may or may not be adjacent are called subset. Order of elements should be same
 * The pattern followed by subset is take it or ignore it
 * Used in permutation and combination
 * **/
public class Subset {
    public static void main(String[] args) {
        String str = "abc";
        String empty ="";
        int[] arr  = {1,2,3,3};
         List<List<Integer>> outer = subSetIntegerArrayContainingDuplicates(arr);
        for (List<Integer> internal:
             outer) {
            System.out.println(internal);
        }
     // subSet(empty,str);
//       System.out.println(subSet(empty,str, new ArrayList<>()));
    }
    private static void subSet(String empty, String str) {
        if(str.isEmpty()){
            System.out.println(empty);
            return  ;
        }

     subSet(empty+str.charAt(0), str.substring(1)); /**take it. ie add it to the empty string **/
      subSet(empty, str.substring(1)); /**or ignore it **/


    }
    private static ArrayList<String> subSet(String empty, String str, ArrayList<String> list) {
        if(str.isEmpty()){
            list.add(empty);
            return list ;
        }

     list = subSet(empty+str.charAt(0), str.substring(1), list); /**take it. ie add it to the empty string **/
     list =subSet(empty, str.substring(1), list); /**or ignore it **/

     return list;
    }
    private static List<List<Integer>> subSetIntegerArray(int [] arr) {
        ArrayList<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<Integer>());
        for (int num:
             arr) {
            int n = outer.size();

            for (int i = 0; i <n ; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                System.out.println("internal before "+internal);
                internal.add(num);
                System.out.println("internal after "+internal);
                outer.add(internal);
            }
        }

        return outer;
    }
    private static List<List<Integer>> subSetIntegerArrayContainingDuplicates(int [] arr) {
        ArrayList<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<Integer>());
        for (int num:
                arr) {
            int n = outer.size();

            for (int i = 0; i <n ; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                System.out.println("internal before "+internal);
                internal.add(num);
                System.out.println("internal after "+internal);
                outer.add(internal);
            }
        }

        return outer;
    }
}
