package Arrays;

import java.util.*;

public class ArraysList {

    private static void getArrayList(List<Integer> ele, HashMap<String, String> query) {
        for (Integer e:
             ele) {
            System.out.println(e);
        }
        for (Map.Entry<String,String> entry :query.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements ");
        int numberOfElements = sc.nextInt();
        List<Integer> ele = new ArrayList<>();
        System.out.println("enter elements ");
        for (int i = 0; i <numberOfElements ; i++) {
            int e = sc.nextInt();;
            ele.add(e);
        }

        System.out.println("enter number of Queries ");
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
