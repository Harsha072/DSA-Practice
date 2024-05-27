package Recursion;

public class NumberOfSteps {

    private static int countSteps(int num, int count) {
        if(num==0){
            return count;
        }
        if(num%2 ==0){
            num = num/2;
            count = count +1;
        }
        else{
            num = num-1;
            count= count+1;
        }

        return countSteps(num, count);

    }
    public static void main(String[] args) {
        int num = 8;
        int count =0;
       System.out.println(countSteps(num, count));
    }


}
