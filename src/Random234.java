import java.util.List;

public class Random234 {
    public static void main(String[] args) {

    }
    public static int simpleArraySum(List<Integer> ar) {
        int res = 0;
        for (Integer element : ar) {
             res += element.intValue();
        }
        return res;

    }
}
