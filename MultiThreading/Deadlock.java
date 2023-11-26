class Library implements Runnable
{
    String res1 = new String("JAVA");
    String res2 = new String("SQL");
    String res3 = new String("DSA");

    public void run()
    {
        String name = Thread.currentThread().getName();
        if(name.equals("STUDENT1"))
        {
            try
            {
                Thread.sleep(3000);
                synchronized(res1)
                {
                    System.out.println("SRUDNET 1 has acquired: "+res1);
                    Thread.sleep(3000);
                    synchronized(res2)
                    {
                        System.out.println("STUDENT 1 has acquired: "+res2);
                        Thread.sleep(3000);
                        synchronized(res3)
                        {
                            System.out.println("STUDENT 1 has acquired: "+res3);
                        }
                    }
                }
            }
            catch(Exception e)
            {
                System.out.println("Some problem");
            }
        }
        else
        { //perfect example of deadlock or cyclic loop
            try
            {
                Thread.sleep(3000);
                synchronized(res1)
                {
                    System.out.println("SRUDNET 2 has acquired: "+res3);
                    Thread.sleep(3000);
                    synchronized(res2)
                    {
                        System.out.println("STUDENT 2 has acquired: "+res2);
                        Thread.sleep(3000);
                        synchronized(res3)
                        {
                            System.out.println("STUDENT 2 has acquired: "+res1);
                        }
                    }
                }
            }
            catch(Exception e)
            {   
                System.out.println("Some problem");
            }
        }
    }
}
public class Deadlock 
{
    public static void main(String[] args) 
    {
        Library l = new Library();

        Thread t = new Thread(l);
        Thread t1 = new Thread(l);

        t.setName("STUDENT1");
        t1.setName("STUDENT2");

        t.start();
        // t.yield();
        t1.start();
    }   
}
