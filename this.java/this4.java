// this can be used to pass an argument in the method call.
class demo
{
    void m1(demo d)
    {
        System.out.println("I am in m1 method");
    }
    void m2()
    {
        m1(this);
    }
}
public class this4 {
    public static void main(String[] args) {
       demo d = new demo();
       d.m2(); 
    }
}
