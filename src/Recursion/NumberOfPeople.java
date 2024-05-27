package Recursion;

public class NumberOfPeople {

    private static int numberOfPeople(int numberOfChoc, int numberOfPeople) {
       if(numberOfChoc<numberOfPeople){
           return numberOfPeople;
       }
       numberOfChoc = numberOfChoc-numberOfPeople;
        numberOfPeople= numberOfPeople+1;
       return numberOfPeople(numberOfChoc, numberOfPeople);
    }
    public static void main(String[] args) {
        int numberOfChoc = 20;
        int numberOfPeople=1;
        int count =0;
        System.out.println(numberOfPeople( numberOfChoc, numberOfPeople));
    }


}
