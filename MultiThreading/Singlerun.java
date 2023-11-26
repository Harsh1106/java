import java.util.Scanner;
class MyThread extends Thread{
    public void run(){
        String str = Thread.currentThread().getName(); //to get the detail of which thread is running currently.
        if(str.equals("msg")){
            msg();
        }else{
            imp();
        }
    }
    public void msg(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");;
        int num1 = sc.nextInt();
        System.out.println("Please enter 2nd no:");
        int num2 = sc.nextInt();
        int res = num1 + num2;
        System.out.println(res);
        System.out.println("Calculation Task Ended");
        System.out.println("******************************************");
    }
    public void imp(){
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



public class Singlerun {
    public static void main(String[] args) {
        System.out.println("Main Thread Started");
        MyThread obj = new MyThread();
        MyThread obj1 = new MyThread();

        obj.setName("msg"); // setting the name of thread

        obj1.setName("imp");

        obj.start();
        obj1.start();
    }
}
