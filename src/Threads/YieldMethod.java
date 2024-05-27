package Threads;


class myThreads implements Runnable{

    public void run(){
        for (int i = 0; i < 8; i++) {
            System.out.println("child thread");
        }
        Thread.yield();
    }

}


public class YieldMethod {

    public static void main(String[] args) {
        myThreads t1 = new myThreads();
        Thread t = new Thread(t1);
        t.start();
        for (int i = 0; i < 8; i++) {
            System.out.println("main thread");
        }
    }



}
