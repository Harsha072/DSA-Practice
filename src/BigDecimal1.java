import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BigDecimal1 {

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){

            s[i]=sc.next();
        }
        sc.close();
        Comparator<String> customComparator = (a, b) ->
                new BigDecimal(b).compareTo(new BigDecimal(a));
        //Write your code here
        Arrays.sort(s, 0, n, customComparator);
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
