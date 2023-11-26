// by default jvm creates a "Main Thread" which executes the program by going them. 
// by default main thread is known as "main" and we can change the name of it too.
// by default it's priority is 5 which can be change.
public class Launch {
    public static void main(String[] args) {
        System.out.println("Main thread");
        System.out.println("Before changing the name and priority of thread:-");
        String name = Thread.currentThread().getName(); //it will give me the information of the thread which is currently running.
        System.out.println("Name of the main thread is: "+name);   //main
        System.out.println("Priority of current thread is: "+Thread.currentThread().getPriority());   //5
        System.out.println("---------------------------------");
        System.out.println("After changing the name and priority of thread:-");
        Thread t = Thread.currentThread(); 
        t.setName("Harsh");
        t.setPriority(1);
        String str = Thread.currentThread().getName();
        System.out.println("Name of the main thread is: "+str);   
        System.out.println("Priority of current thread is: "+Thread.currentThread().getPriority());
    }
}
