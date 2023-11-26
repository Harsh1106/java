class Printing implements Runnable{
    
    public void run(){
        try{
            for(int i = 0 ; i < 2 ; i++){
                System.out.println("Focus is the key");
                Thread.sleep(3000);
            }
        }catch(Exception e){
            System.out.println("Some problem has been encountered.");
        }
    }
}


public class Join_Alive {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        Printing p = new Printing();

        Thread t = new Thread(p);
        System.out.println(t.isAlive()); //false
        t.start();
        System.out.println(t.isAlive()); //true
        // t.join(); // sbse phle jo thread exisiting h usko execute krega fir aage bdhega and isko jab use krenge to compiler runtime error dga to usko resolve krne k liye hm "throws Exception" ka use krenge ik that isn't a good practice but we have to do this or otherwise in try catch block.
        try{
            t.join();
        }catch(Exception e){
            System.out.println("Ignore");
        }

        System.out.println("Main thread work has finished.");
    }
}
