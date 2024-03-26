import java.util.Scanner;

public class altSum{
    public static int sum(int num){
        if(num == 0){
            return 0;
        }
        // recursive function call
        if(num % 2 == 0){ //if num is even then we will subtract the num
            return sum(num - 1) - num;
        }
        else{ //if num is odd then we will add the num
            return sum(num - 1) + num;
        }
    }
    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();
        int result = sum(num);
        System.out.println(result);
    }
}