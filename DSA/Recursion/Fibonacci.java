// TC: O(2^n)
// SC: O(n) --> bcoz of stack

import java.util.Scanner;

public class Fibonacci {
    public static int fib(int num){
        if(num <= 1){
            return 1;
        }else{
            return fib(num - 1)+fib(num - 2);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number which fibonacci series you want: ");
        int n = sc.nextInt();
        int res = fib(n);
        System.out.println("The fibonacci series of "+n+" is "+res);
    }
}
