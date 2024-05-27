public class SumOfDigitsOfPositiveNumber {
    private static int getSum(String s, int i, int sum) {
        if(i>s.length()-1){
           
            return sum;
        }
        int a = s.charAt(i++)-'0';

        sum +=a;
        return getSum(s,i,sum);
    }
    public static void main(String[] args) {
        String s = "123";
        int i = 0;
        int sum=0;
        System.out.println(getSum(s,i, sum));
    }


}
