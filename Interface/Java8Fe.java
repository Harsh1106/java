// After java 8 we can also implement a mthd inside the interface class using default keyword.
// We can also use static method inside the interface using static keyword before the method name.


interface A
{
    // default method
    void print();
    void show();
    default void config()
    {
        System.out.println("In config.");
    }
    static void abc()
    {
        System.out.println("In abc");
    }
}


class B implements A{
    // the inherited method should be public always.
    public void show(){
        System.out.println("In show.");
    }
    public void print(){
        System.out.println("Print is in show");
    }
}
public class Java8Fe {
    public static void main(String[] args) {
        A.abc();
        A obj = new B();
        obj.show();
        obj.config();
    }
}
