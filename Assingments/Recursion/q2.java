import java.util.Scanner;

public class q2 {
    public static int altSum(int n){
        int res = 0;
        if(n == 0){
            return 0;
        }

        if(n % 2 == 0){
            return -n + altSum(n - 1);
        }else{
            return n + altSum(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int res = altSum(n);
        System.out.println(res);
    }
}
