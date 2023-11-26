import java.util.Scanner;
@FunctionalInterface
interface operation{
    void perform(int a, int b);
}

class first{
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter any two numbers: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        operation obj = (x,y) -> System.out.println("Sum: "+(a+b));  
        obj.perform(a, b);
    }
}