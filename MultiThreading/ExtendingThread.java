// We can implement thread by two ways:
// 1. ExtendingThread Class(which extends Runnable class)
// 2. Implementing Runnable Interface

class MyThread extends Thread{
    public void run(){
        System.out.println("Child Thread");
    }
}

public class ExtendingThread {
    public static void main(String[] args) {
        System.out.println("Main Thread");
        MyThread t = new MyThread();
        t.start();
    }
}
