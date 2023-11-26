// It refers to the mistakes done by the programmer in terms of writing a logic.
// These mistskes are identified by JVM during the execution og a programmer, so we say it as "RunTimeError".
public class SecondProgram {
    public static void main(String[] args) {
        int num = 6;
        int num2 = 0;
        int res = num / num2;
        System.out.println(res); //will generate a runtime error.
    }
}
