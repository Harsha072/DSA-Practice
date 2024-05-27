import java.util.*;

public class Solution2 {

  static int [] a = {45,78,89,54,78};
  static  byte [] b;
  static  int temp;

    public static void main(String[] args) {

        for (int i = 0; i < a.length-1 ; i++) {
          for (int j=1;j<a.length-1;j++){
              if(a[i]>a[j]){
                  temp = a[i];
                  a[i] = a[j];
                  a[j] = a[i];
              }

;
          }

        }

        for (int g :
             a) {
            System.out.println(g);
        }


    }
}
