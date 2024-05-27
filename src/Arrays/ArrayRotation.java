package Arrays;


//array rotation 3 times
public class ArrayRotation {

    private static int [] reverse(int [] arr , int start, int end){
        for (int i = start; i <end ; i++, end--) {
            int temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;

        }
      return arr;
    }
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7};
        int k = 3;
       reverse( a,0, 3);
       reverse(a,k+1,a.length-1);
       reverse(a,0,a.length-1);
        for (int v:
             a) {
            System.out.println(v);
        }
    }
}
