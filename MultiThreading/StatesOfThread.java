class demo1 implements Runnable{
    public void run(){
        System.out.println("Class Thread Executing");
        try{
            Thread.sleep(3000);
        }catch(Exception e){
            System.out.println("Some problem: "+e);
        }
        System.out.println("Child class task completed");
    }
}
public class StatesOfThread {
    public static void main(String[] args) {
        System.out.println("Main Thread");
        
        demo1 d = new demo1();

        Thread t = new Thread(d);

        t.start();
    }
}
