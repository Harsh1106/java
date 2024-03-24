import java.util.Scanner;

public class CountWays {
    public static int findWays(int num){
        int res = 0;
        if(num <= 1){
            return num;
        }else{
            res = findWays(num-1+1) + findWays(num-2+1);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose number of ways you want:");
        int ways = sc.nextInt();
        int res = findWays(ways);
        System.out.println(res);
    }
}
