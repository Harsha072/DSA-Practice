package Threads;


class MyThread extends Thread{

    public void run(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("child");
        }
    }
}


public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        Thread t1 = new Thread(t);
        t1.start();
        t1.join();
        for (int i = 0; i <5 ; i++) {
            System.out.println("main");
        }
    }
}
