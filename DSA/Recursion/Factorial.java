// TC: O(n) from recurrence relation
// SC: O(n)

import java.util.*;

public class Factorial {
    public static int factNum(int num){
        int res = 0;
        //1.base case condition
        if(num == 0 || num == 1){
            return 1;
        }else{
            //2. Recursive function calling
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