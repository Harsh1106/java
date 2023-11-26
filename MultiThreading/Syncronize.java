// synchronized can be applied on method as well as block

class Car implements Runnable
{
    // synchronized public void run()
    // using this will lead to synchronized the whole method
    public void run()
    {
        try
        {
            System.out.println(Thread.currentThread().getName() + " Has entered the parking lot.");
            Thread.sleep(2000);
            synchronized(this) //<---- this will lead to synchronize the whole method which means the first two lines will be executed by random threads but inside blocks one thread will allowed to use them
            {
                System.out.println(Thread.currentThread().getName() + " Get into the car");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " Started to drive the car");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " Reached Home");
            }
        }
        catch(Exception e)
        {
            System.out.println("Some problem has encountered");
        }
    }
}

public class Syncronize 
{
    public static void main(String[] args) 
    {
        Car c = new Car();
        Thread t = new Thread(c);
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);

        t.setName("SON-1");
        t1.setName("SON_2");
        t2.setName("SON-3");


        t.start();
        t1.start();
        t2.start();

    }
}
