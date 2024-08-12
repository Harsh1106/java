// only applicable on functional interface.
// used to do less coding.
// this methods only works on above of java 8.

@FunctionalInterface
interface car{
    // void drive();
    // void drive(int age);
    void drive(int age , int ts);
}
public class first {
    public static void main(String[] args) {
        // car obj = () -> System.out.println("Driving"); ----> for no argument one
        // obj.drive();
        // car obj = age -> System.out.println("sksksk"); -----> for one parameter syntax
        // obj.drive(1);
        car obj = (avg, ts) -> System.out.println("Driving at speed of: "+ts+"\nAge is: "+avg);
        obj.drive(46,195);
    }
}
