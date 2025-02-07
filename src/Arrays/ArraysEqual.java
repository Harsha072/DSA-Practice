package Arrays;

public class ArraysEqual {
    
    private static boolean equals(int[] a , int [] b){
        if (a == null || b == null) {
            return a == b;
        }

        // Length check
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i <a.length ; i++) {
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        int [] b = {1,2,3,4,5};
        System.out.println(equals(a,b));
        
    }
}
