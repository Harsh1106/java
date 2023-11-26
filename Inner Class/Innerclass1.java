// We can write static only on the inner class not the outer one.


class X
{
    public void show(){
        System.out.println("In show.");
    }
    // class Y
    // {
    //     public void display(){
    //         System.out.println("In display.");
    //     }
    // }
    static class Y
    {
        public void display(){
            System.out.println("In display.");
        }
    }
}
public class Innerclass1 {
    public static void main(String[] args) {
        X obj = new X();
        obj.show();
        // obj.display(); we can't call the inner class member from the parent class object.
        //If inner class is non static
        // X.Y obj1 = obj.new Y();
        // obj1.display();

        //If inner class is static
         X.Y obj1 = new X.Y();
         obj1.display();
    }
}
