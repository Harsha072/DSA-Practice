import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.lang.reflect.Method;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Arrays;

import static java.lang.System.in;

class Prime {
    public void checkPrime(Integer... checks) {
        List<Integer> in = Arrays.stream(checks)
                .filter(i -> i != 1)
                .filter(check -> IntStream.range(2, check)
                        .filter(c -> (check % c) == 0)
                        .boxed().count() == 0)
                .collect(Collectors.toList());
        System.out.println(in.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
class Solution {

    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            Prime ob=new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1,n2);
            ob.checkPrime(n1,n2,n3);
            ob.checkPrime(n1,n2,n3,n4,n5);
            Method[] methods=Prime.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for(int i=0;i<methods.length;i++)
            {
                if(set.contains(methods[i].getName()))
                {
                    overload=true;
                    break;
                }
                set.add(methods[i].getName());
            }
            if(overload)
            {
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}