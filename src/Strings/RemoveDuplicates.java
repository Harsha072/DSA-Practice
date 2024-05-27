package Strings;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String dup = "hello";
        StringBuilder res = new StringBuilder();

       char [] c = dup.toCharArray();
       int rd = 0;
        for (int i = 1; i <c.length ; i++) {
            if(c[rd]!=c[i]){
                rd++;
                c[rd] = c[i];
            }
        }
        for (int i=0;i<rd+1;i++)
        {
           res.append(c[i]);
        }
        System.out.println(res);
    }
}
