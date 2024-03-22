import java.util.Scanner;

public class Recursive {
    public static int factNum(int num){
        int res;
        if(num == 0 || num == 1){
            return 1;
        }else{
            res = num * factNum(num - 1);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number u want to get factorial:");
        int n = sc.nextInt();
        int res = factNum(n);
        System.out.println(res);
    }
}