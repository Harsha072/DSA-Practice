 abstract class SuperClass {

    String x;
    SuperClass(){
        super();
    }
    abstract void hi();
}

class SubClass extends SuperClass {

    String x;

    public SubClass(){
        super();
    }

    public void hi(){

        System.out.println("child");

    }

}
public class Main15{

    public static void main(String[] args) {
        SubClass s = new SubClass();
        s.hi();

    }
}
