//In child class we have to define the inherited method.
// If we dont then it will generate an error.
// Interface can extend each other using extend keyword.

interface A
{
    void show();
}
interface X{
    void abc();
}
class B implements A,X{
    public void show(){
        System.out.println("In show");
    }
    public void abc(){
        System.out.println("In abc");
    }
}
public class Interface3{
    public static void main(String[] args) {
        A obj = new B(); //A type of object
        obj.show();
        X obj1 = new B();
        obj1.abc();
    }
}