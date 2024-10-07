import java.util.Scanner;

class Calc extends Thread{
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first no:");
        int num1 = sc.nextInt();
        System.out.println("Please enter 2nd no:");
        int num2 = sc.nextInt();
        int res = num1 + num2;
        System.out.println(res);
        System.out.println("Calculation Task Ended");
        System.out.println("******************************************");
        sc.close();
    }
}

class Message extends Thread{
    public void run(){
        System.out.println("Displaying important message task:");
        try{
            for(int i = 0 ; i < 3 ; i++){
                System.out.println("Focus is the key");
                Thread.sleep(2000);
            }
        }catch(Exception e){
            System.out.println("Some proble has occurred");
        }
        System.out.println("Displaying msg task has been ended.");
    }
}

public class MultipleThread {
    public static void main(String[] args) {
        System.out.println("Main Thread");
        Calc c1 =  new Calc();
        Message m1 = new Message();   
        // These both object states that the object of thread has been created. 
        c1.start();/*<-------
                            |
                            |
                            |--------> inherited methods, on doing this we handover our threads to thread scheduler and now the thread scheduler will decide that which thread will be called.
                            |
                            |
                     -------->*/m1.start();
    }
}
