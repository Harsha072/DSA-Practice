

class Test2{

    public void hello(){
        System.out.println("hi");
    }
}

class Test extends Test2 {
int a1;

public void hello(int i , float d){
    System.out.println("hello int and float");
}

    public void hello1( float d,int i){
        System.out.println("hello float and int");
    }
    public void hello2( double d,double i){
        System.out.println("hello double and double");
    }

    public static void main(String[] args){
//       String arr = "Where you going? Are you are coming here?";
//     String [] arrS=  arr.split(" ");
//     int index=0;
//    for (int i = 0; i <arrS.length ; i++) {
//        String word = arrS[i].toLowerCase();
//        word = Character.toUpperCase(word.charAt(0)) + word.substring(1);
//        System.out.println(word);
//    }
     Test t = new Test();
     t.hello(10, 78f);
     t.hello1(10f,56);
     t.hello2(10,10);


}
}
