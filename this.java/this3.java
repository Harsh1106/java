// this() can be used to invoke current class constructor.
class Demo
{
    Demo()
    {
        this(10);
        System.out.println("no arg constructor");
    }
    Demo(int a)
    {
        // this(); //it will invoke the no arg constructor.
        System.out.println("Parameterized constructor");
    }
}
public class this3 {
    public static void main(String[] args) {
        Demo d = new Demo();
    }
}
