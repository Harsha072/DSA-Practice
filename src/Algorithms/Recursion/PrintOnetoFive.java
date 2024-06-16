package Algorithms.Recursion;

public class PrintOnetoFive {

    private static void printOneToFive(int i) {
        if(i==0){
            System.out.println(i);
            return ;
        }

        printOneToFive(i-1);
        System.out.println(i);
    }
    public static void main(String[] args) {
        printOneToFive(5);
    }


}
