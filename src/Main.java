import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Output
BigDecimal [] big = new BigDecimal[n];
        for(int i=0;i<n;i++)
        {
           big[i] = new BigDecimal(s[i]);

        }
        for(int i=0;i<big.length;i++)
        {
            System.out.println(big[i].compareTo(big[i+1]));

        }

    }
}