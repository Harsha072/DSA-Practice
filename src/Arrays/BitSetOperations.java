package Arrays;

import java.util.BitSet;
import java.util.Scanner;

public class BitSetOperations {
        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            int size = Integer.parseInt(s.split(" ")[0]);
            System.out.println(s.split(" ").length);
            int operations = Integer.parseInt(s.split(" ")[1]);

            BitSet bitSet1 = new BitSet(size); // BitSet with 8 bits
            BitSet bitSet2 = new BitSet(size);
            for (int i = 0; i <size ; i++) {
                bitSet1.set(0);
                bitSet1.set(0);
            }
            for (int i = 0; i <operations ; i++) {
                String op = sc.nextLine();
                if(op.equals("AND")){
                    bitSet1.and(bitSet2);
                    System.out.println(bitSet1.length()+" "+bitSet2.length());
                } else if (op.equals("OR")) {
                  bitSet2.or(bitSet1);
                    System.out.println(bitSet1.length()+" "+bitSet2.length());
                }
                else if (op.equals("XOR")) {
                    bitSet1.xor(bitSet2);
                    System.out.println(bitSet1.length()+" "+bitSet2.length());
                }
                else if (op.equals("FLIP")) {
                   bitSet2.flip(2);
                }
                else if (op.equals("SET")) {
                    bitSet1.set(4);
                    System.out.println(bitSet1.length()+" "+bitSet2.length());
                }
            }


        }

}
