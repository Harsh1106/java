// TC: O(m*n)
// SC: O(1)
import java.util.Scanner;

public class PrefixSumConcept {
    // public static int prefixSum(int arr[][], int row1, int row2, int col1, int col2){
    //     int sum = 0;
    //     for(int i = row1 ; i <= row2 ; i++){
    //         for(int j = col1 ; j <= col2 ; j++){
    //             sum += arr[i][j];
    //         }
    //     }
    //     return sum;
    // }

    // time complexity: O(m*n)
    // space complexity: O(1)
    public static void prefixSumMatrix(int[][] arr){
        int m = arr.length;
        int n = arr[0].length; //means 0th row ki length ky hai
        
        // traversed the array row wise to calculate the row-wise prefix sum.
        for(int i = 0 ; i < m ; i++){
            for(int j = 1 ; j < n ; j++){
                arr[i][j] += arr[i][j-1];
            }
        }
        // traverse the array column-wise to calculate the column-wise perfix sum.
        for(int j = 0 ; j < n ; j++){
            for(int i = 1 ; i < m ; i++){
                arr[i][j] += arr[i-1][j];
            }
        }
    }

    // time complexity:O(1)
    // space complexity:O(1)
    public static int sumRegion(int[][] arr, int r1, int c1, int r2, int c2){
        int sum = 0, up = 0, left = 0, repeated_region = 0, result = 0;
        sum = arr[r2][c2];
        up = arr[r1-1][c2];
        left = arr[r2][c1-1];
        repeated_region = arr[r1-1][c1-1];
        result = sum - up - left + repeated_region;        
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{1,1,1,1},
                       {1,1,1,1},
                       {1,1,1,1},
                       {1,1,1,1}};
        System.out.println("Enter the row1 and col1 value: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        // if(r1 == 0 || c1 == 0){
        //     System.out.println("Please enter greater then 0 value for r1 & c1.");
        // }
        // r1 = sc.nextInt();
        // c1 = sc.nextInt();
        
        System.out.println("Enter the row2 and col2 value: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        // int sum = prefixSum(arr, row1, row2, col1, col2);
        prefixSumMatrix(arr);
        int sum = sumRegion(arr,r1,c1,r2,c2);
        System.out.println("Sum: "+sum);
    }
}
