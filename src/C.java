class A {
    public void m1(){
      System.out.println("class A");
    }
}
class B extends  A{
    public void m2(){
        System.out.println("class B");
    }
    public void m1(){
        System.out.println("overriden in b");
    }
}
public class C {
    public static void main(String[] args) {
        A a = new B();
        a.m1();
       A a1 = new A();
        a1.m1();
        B b = new B();
        a.m1();
        b.m2();
    }
}