package Recursion;

public class SumOfDigit {
    private static int sumOfDigit(int num) {
        if(num==1){
            return 0;
        }
        int lastDigit = num % 10;
        num = num /10;
        return lastDigit+sumOfDigit(num);
    }
    private static void printNum(int num) {
        if(num==0){
            return;
        }
        System.out.println(num);
        printNum(--num);

    }
    public static void main(String[] args) {
        int num = 1324;
        int n = 5;
        printNum(5);
//        sumOfDigit(num);
    }


}
