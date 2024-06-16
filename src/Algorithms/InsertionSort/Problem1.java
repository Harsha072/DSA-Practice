package Algorithms.InsertionSort;

import java.util.ArrayList;
import java.util.List;

// Definition for a pair
 class Pair {
     int key;
     String value;

     Pair(int key, String value) {
         this.key = key;
         this.value = value;
     }
    @Override
    public String toString() {
        return "(" + key + ", \"" + value + "\")";
    }
 }
public class Problem1 {
    public static List<List<Pair>> insertionSort(List<Pair> pairs) {
       List<List<Pair>> sample = new ArrayList<>();

        for (int i = 0; i <pairs.size() ; i++) {
            for (int j = i; j > 0 && pairs.get(j).key < pairs.get(j - 1).key; j--) {

                    Pair temp = pairs.get(j);
                    pairs.set(j, pairs.get(j-1));
                    pairs.set(j-1,temp);
            }
            List<Pair> cloneList = new ArrayList<>(pairs);
            sample.add(cloneList);

        }


        return sample;

    }

    public static void main(String[] args) {
        Pair p1 = new Pair(5,"apple");
        Pair p2 = new Pair(2,"banana");
        Pair p3 = new Pair(9,"cherry");

        List<Pair> pairs = new ArrayList<>();
        pairs.add(p1);
        pairs.add(p2);
        pairs.add(p3);
        List<List<Pair>> result = insertionSort(pairs);

        for (List<Pair> state : result) {
            System.out.println(state);
        }


    }
}
