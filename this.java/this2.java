// this keyword can be used to invoke current class method(implicitly).

class Demo
{
    void display()
    {
        System.out.println("Hello!");
    }
    void show()
    {
        // display();
        this.display();
        // both the method will give same output.
        // The reason is thatif we don't use this keyword, compiler automatically adds this keyword while invoking the method.
    }
}

public class this2 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
    }
}
