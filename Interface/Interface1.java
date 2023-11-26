// In interface we call the member from the interface name directly using the dot operator.
interface A
{
    int num = 6; // by default variable is public static final.
    void show(); //cant define the method.
}


public class Interface1  {
    public static void main(String[] args) {
        System.out.println(A.num);
        // A.mn = 10;  bcoz it is a final variable so we cant update the value.
        
    }
}
