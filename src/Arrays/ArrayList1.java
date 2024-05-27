package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int numberOfElements = sc.nextInt();
        List<Integer> ele = new ArrayList<>();

        for (int i = 0; i <numberOfElements ; i++) {
            int e = sc.nextInt();;
            ele.add(e);
        }


        int numberOfQueries = sc.nextInt();

        for (int i = 0; i <numberOfQueries ; i++) {
            String query = sc.next();
            if(query.equalsIgnoreCase("Insert")){
                ele.add(sc.nextInt(), sc.nextInt());
            } else if (query.equalsIgnoreCase("Delete")) {
                ele.remove(sc.nextInt());
            }
        }
        for(int element : ele){
            System.out.print(element + " ");
        }
        sc.close();

    }
}