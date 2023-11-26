import java.util.Scanner;
class Calc implements Runnable{
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
    }
}
class Dhua implements Runnable{
    public void run(){
        System.out.println("Displaying important message task:");
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("Focus is the key");
        }
        System.out.println("Displaying important msg after task ended");
    }

}
public class RunnableInterface {
    public static void main(String[] args) {
        System.out.println("Main thread");

        
        Calc c1 = new Calc(); // not a thread type object
        Dhua d1 = new Dhua();
// here no relation between thread and class bcoz directly we r implementing the methods, but explicitly we can use thread by passing our object to thread it will go in thread's constructor
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(d1);
        
        t1.start();
        t2.start();
    }
}
