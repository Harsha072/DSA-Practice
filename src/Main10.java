public class Main10 {

     int outside;
     final int outside2=0;
    public static   void hello(){
        int inside=10;

        System.out.print("inside class main 10"+inside);
    }
}
class D extends Main10 {

    public static   void hello(){
        int inside=10;

        System.out.print("inside class d "+inside);
    }
    public static void main(String[] args) {
        Main10 a = new D();
       a.hello();
    }
}
