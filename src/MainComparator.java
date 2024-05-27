import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class MyComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Integer object1 = (Integer) o1;
        Integer object2 = (Integer) o2;
        if(object1<object2){
            return +1;
        } else if (object1>object2) {
            return -1;
        }
        else return 0;
    }
}
public class MainComparator {
    public static void main(String[] args) {
        ArrayList <Integer>list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Collections.sort(list,new MyComparator());

        for (Integer i1:
             list) {
            System.out.println(i1);
        }
    }
}
