import java.util.Scanner;

public class q5 {
    public static boolean sq(int num){
        if(num >= 0){
            int sr = (int)Math.sqrt(num);
            return (sr * sr) == num;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = sq(num);
        if(flag == true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }   
}
