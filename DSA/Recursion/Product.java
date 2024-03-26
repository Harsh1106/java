import java.util.Scanner;

public class Product {
    public static void prod(int n, int k){
        if(k == 1){
            System.out.print(n+" ");
            return;
        }
            prod(n, k-1);
            System.out.print(n * k+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = sc.nextInt();
        System.out.println("Enter the times:");
        int k = sc.nextInt();
        prod(num, k);
    }
}
