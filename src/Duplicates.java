import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Duplicates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        while (n-- > 0) {
            Set<String> set = new LinkedHashSet<>();
            List<String> list = new ArrayList<>();
            String in = sc.nextLine();
            String[] sl = in.split(" ");

            for (String s : sl) {
                if (!list.contains(s.toLowerCase())) {
                    set.add(s);
                    list.add(s.toLowerCase());
                }
            }

            String output = "";

            for (String o : set) {
                output += o + " ";
            }

            System.out.println(output);
        }
    }
}
