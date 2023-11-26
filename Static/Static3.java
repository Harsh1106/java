class Demo1
{

    // whenever a common copy of data has to be sharred among all the object of the class then we go with static variables bcoz during the class loading itself memoroy will be allocated in the heap area and same copy of data will be sharred among all the objects and memory will be created once and hence it is more efficient.


    //static variable are called class members.
    // bcoz it will used throughout the program
    //static member is object independent
    static int a;
    static int b;

    //fields, object variable or local variables all are name of these variables
    int m;
    int n;

    static
    {
        a = 10;
        b = 20;
        System.out.println("Control in static block");
    }

    //java initailization block
    //when obj is created it also get executed by default.
    {
        m = 100;
        n = 200;
        System.out.println("Control in non static block or initialization block");
    }

    static void disp1()
    {
        System.out.println("Value of static var: "+a);
        System.out.println("Value of static var: "+b);
        // System.out.println(m); can't call instance variable inside a static method.
    }
    void disp2()
    {
        System.out.println("Value of instance var: "+m);
        System.out.println("Value of instance var: "+n);
        // System.out.println(a); can call static variable inside non static method.
    }
}

public class Static3 {
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        Demo1.disp1();
        d.disp2();   
    }
}
