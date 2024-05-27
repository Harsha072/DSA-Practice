package Arrays;

public class ArraysMoveAllZerosTillEnd {

    private static void swap(int i, int i1) {
        int temp = i;
        i = i1;
        i1 = temp;
    }
    public static void main(String[] args) {
        int[] a = {10, 8, 0, 5, 6, 0, 4, 0};
        int i = 0;
        int k = 0;

        while (k < a.length) {

            if (a[k] != 0) {
                int temp = a[i];
                a[i] = a[k];
                a[k] = temp;
                i++;
                k++;
            }
            else k++;
        }

        for (int j = 0; j < a.length; j++) {
            System.out.println(a[j]);
        }

        
    }


}
