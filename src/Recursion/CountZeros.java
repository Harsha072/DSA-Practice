package Recursion;

public class CountZeros {
    private static int countZeros(int n, int count) {
        if(n==0){
            return count;
        }
        n = n/10;
        if (n==0) count++;
        return  countZeros(n,count);
    }
    public static void main(String[] args) {
        int n = 3040;
        int count = 0;
        System.out.println(countZeros(n,count));
    }

}
