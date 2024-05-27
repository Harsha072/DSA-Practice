public class Main5 {

    public void hi(){

    }
}
class B1 extends Main5{

    public  void heloo(){

    }
}
class C2 {
    public static void main(String[] args) {
        Main5 m = new Main5();
        m.hi();

        B1 b = new B1();
        b.hi();
        b.heloo();

        Main5 m2 = new B1();

    }
}