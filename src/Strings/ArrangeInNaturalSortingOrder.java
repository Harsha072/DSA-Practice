package Strings;

public class ArrangeInNaturalSortingOrder {
    public static void main(String[] args) {
        String [] a ={"hi","amazing","dog"};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].compareTo(a[j]) > 0) {
                    String temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }

        for (String ele : a) {
            System.out.println(ele);
        }

    }
}
