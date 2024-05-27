package Strings;

public class StringBufferExamples {
    String s = "hi";


    public static void main(String[] args) {
        StringBufferExamples ex = new StringBufferExamples();
        StringBuffer sb = new StringBuffer(ex.s);
        sb.insert(1,'g');
        System.out.println(sb);
    }
}
