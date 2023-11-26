class Demo
{
    static void disp1()
    {
        System.out.println("Inside the static disp1");
    }
    void disp2()
    {
        System.out.println("Inside the non static method disp2");
    }
}
/*
   *For execution of static method from another class we didn't need any object we can call it by the name
    of class it self bcoz static are not dependent on objects can be executed from class.
   *It is the only example in java where we didn't need any object to call the method we can call from 
    the name of class.
   *Static variable can be invoked using direct class name as well as object name also.
 */
public class Static2 {
    public static void main(String[] args) {
        Demo.disp1();

        Demo d = new Demo();
        // d.disp1();
        d.disp2();
    }
}
