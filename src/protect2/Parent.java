package protect2;

public class Parent{

    protected  String hi="hello pro";
    protected  void  hello(){
        System.out.println("protected::::");
    }
}

class child extends  Parent{

//    protected   void hello(){
//        System.out.println("protected child:::::: ");
//    }
    public static void main(String [] args){
        Parent p = new child();
        p.hello();
    }
}