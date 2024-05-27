import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Big2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean isPrime = true;

        String n = bufferedReader.readLine();
        BigInteger a
                = new BigInteger(
                n);

        // When certainty is one,
        // it will check number for prime or composite
     boolean   result = a.isProbablePrime(1);
     if(result){
         System.out.println("prime");
     }
     else System.out.println("not prime");
     System.out.println(result);
        bufferedReader.close();
    }

}
