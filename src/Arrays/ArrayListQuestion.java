package Arrays;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//Arraylist question hacker rank
public class ArrayListQuestion {
    private static void printHashmap(HashMap<Integer, ArrayList> map, ArrayList query) {
        System.out.println("printing hashmap");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer,ArrayList> map = new HashMap<>();
        System.out.println("enter number of lines");
        int numberofLines = sc.nextInt();

        for (int i = 0; i < numberofLines; i++) {
            System.out.println("enter number of elements");
            int d = sc.nextInt();
            ArrayList numbers = new ArrayList();

            for (int j = 0; j < d; j++) {
                numbers.add(sc.nextInt()) ;
            }
             map.put(i,numbers);

            System.out.println();
        }
        System.out.println("enter number of  queries");
        int numberOfQueries = sc.nextInt();
        ArrayList queries = new ArrayList();
        for (int i = 0; i <numberOfQueries ; i++) {
            queries.add(sc.nextLine()) ;
        }

        sc.close(); // Close the scanner
        printHashmap(map,queries);
    }


}

