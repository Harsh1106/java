

import java.util.Scanner;

public class Sum {
    public static int res(int num){
        if(num == 0){
            return num;
        }else{
            return num % 10 + res(num / 10);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int sum = res(num);
        System.out.println("The sum of number is: "+sum);
    }
}
