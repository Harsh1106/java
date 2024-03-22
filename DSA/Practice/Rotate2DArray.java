// TC: O(m * n)
// SC: O(1)

import java.util.Arrays;

public class Rotate2DArray {
    public static void rotateArr(int arr[][]){
        int m = arr.length;
        int n = arr[0].length;

        // Transpose the matrix
        for(int i = 0 ; i < m ; i++){
            for(int j = i ; j < n ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //Swap the columns
        for(int i = 0 ; i < m ; i++){
            int li = 0;
            int ri = n - 1;
            while(li < ri){
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;
                li++;
                ri--;
            }
        }
    }
    public static void main(String[] args) {
        // int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        // int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        // int[][] arr = {{1,2,3,4},{5,6,7,8}};
        int[][] arr = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotateArr(arr);
        for(var arr1 : arr){
            System.out.println(Arrays.toString(arr1));
        }
    }
}
