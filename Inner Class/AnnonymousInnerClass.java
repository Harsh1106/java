// Example of an anonymous class.

interface Car{
    void drive();
}
public class AnnonymousInnerClass {
    public static void main(String[] args) {
        Car obj = new Car() // it is not an implementation of interface,  ye bs interface ko implement kr rha hai
        { // aur ye class ka koi naam ni hai issliye AnnonymousInnerClass naam hai.
            public void drive()
            {
                System.out.println("Driving...");
            }
        };// aur ye anonymous class ek hi baar use hoga dobara agr krna h to fir se bnana hoga  
        obj.drive();
    }
}
