import java.math.BigInteger;
import java.util.Scanner;

// Brute force approach 
// TC: O(b) --> which is too high
// public class PowerFinding{
//     public static int power(int a,int b){
//         if(b == 0){
//             // base case condition
//             return 1;
//         }else{
//             return a*power(a,b-1); //recursive condition
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the subscript: ");
//         int sub = sc.nextInt();
//         System.out.println("Enter the superscript: ");
//         int sup = sc.nextInt();
//         int result = power(sub, sup);
//         System.out.println("After calculating the "+sub+"^"+sup+" result is: "+result);
//     }
// }

public class PowerFinding{
    // public static long findPower(long a, long b){
    //     long result = 0, finalAns = 0;
    //     if(b == 1){
    //         return a;
    //     }else{
    //         result = findPower(a, b/2);
    //         finalAns = result * result;

    //         if(b % 2 == 0){
    //             return finalAns;
    //         }else{
    //             return finalAns*a;
    //         }
    //     }        
    // }


    // now more optimized approach
    public static int powerFind(int sub, int sup){
        int result , finalResult;
        if(sup == 1){
            return sub;
        }
        else if(sup < 0){
            return 1/(sub*powerFind(sub, -sup-1));
        }
        else{
            result = powerFind(sub, sup/2);
            finalResult = result*result; //this is the way to do multiplication if we r using BigInteger type variable using multiply function  
            if(sup % 2 == 0){
                return finalResult;
            }
            else{
                return sub*finalResult;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the subscript: ");
        int sub = sc.nextInt();
        // BigInteger sub = sc.nextBigInteger(); //inside the math package 
        System.out.println("Enter the superscript: ");
        int sup = sc.nextInt();
        // BigInteger sup = sc.nextBigInteger();
        // int result = findPower(sub, sup);
        // BigInteger result = powerFind(sub, sup);
        int result = powerFind(sub, sup);
        System.out.println("After calculating the "+sub+"^"+sup+" result is: "+result);
    }
}