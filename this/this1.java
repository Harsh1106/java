// this keyword can be used to refer current class instance variable.
// this keyword can be used to invoke current class method(implicitly).
// this() can be used to invoke current class constructor.
// this can be used to pass an argument in the method call.
// this can be used to pass an argument in the constructor call.
// this can be used to return the current class instance from the method. 
class Test
{
    int i;
    void setValue(int i)
    {
        this.i = i;  // this keyword can be used to refer current class instance variable.
    }
    void show()
    {
        System.out.println(i);
    }
}
public class this1 {
    public static void main(String[] args) {
        Test t = new Test();
        t.setValue(10);
        t.show();
    }   
}
