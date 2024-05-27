package Arrays;

public class ArraysCompare {
    public static void main(String[] args) {
        String[] fruits = {"banana", "apple", "orange", "grape", "pineapple"};
        for (int i = 0, j=1; i <fruits.length && j<fruits.length ; i++,j++) {
            if(fruits[i].compareTo(fruits[j])>0){
                 String temp = fruits[i];
                 fruits[i] = fruits[j];
                 fruits[j] = temp;
            }
        }
        for (String a:
             fruits) {
            System.out.println(a);
        }
    }
}
