// Approach: Modified binary search
// TC: O(logN)
// SC: O(1)

import java.util.Scanner;

public class SquareRoot {
    public  static int findSquareRoot(int num){
        int low = 0, high = num, result = -1;
        // modified binary search
        while(low <= high){
            int mid = low + (high - low)/2;
            long val = mid * mid;
            if(val == num){
                // perfect square exist
                return mid;
            }
            else if(val < num){
                //  store the floor value because the number is not a perfect root we can print the floor value
                result = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of which you want the square root");
        int num = sc.nextInt();
        int result = findSquareRoot(num);
        System.out.println("Square root of the given number is: "+result);
    }
}
