import java.util.Arrays;

public class noOfInversion {
    public static int mergeProcedure(int[] arr, int l, int mid, int h)
    {
        int swap = 0;
        // left and right subarray
        int[] lsubarray = Arrays.copyOfRange(arr, l, mid+1); //+1 bcoz it doesn't take last index
        int[] rsubarray = Arrays.copyOfRange(arr, mid+1, h+1);
        int i = 0, j = 0, k = l;
        while(i < lsubarray.length && j < rsubarray.length)
        { 
            if(lsubarray[i] < rsubarray[j]){
                arr[k] = lsubarray[i];
                i = i + 1;
            }   
            else{
                arr[k] = rsubarray[j];
                j = j + 1;
                 // calculate the number of swaps
                swap += (mid + 1) - (l + i);
            }
            k = k + 1;
        }
        // copy all the remaining elements from lsubarray
        while(i < lsubarray.length){
            arr[k++] = lsubarray[i++]; 
        }
        // copy all the remaining elements from rubsarray
        while(j < rsubarray.length){
            arr[k++] = rsubarray[j++];
           
        }
        return swap;
    }
    public static int inversionCountDC(int[] arr, int l, int h){
        int count = 0;
        if(l < h){
            // Dividing tthe array into two subproblems
            int mid = l + (h - l)/2;

            // Conquer the subproblem using the recursive approach
            count += inversionCountDC(arr, l , mid); //left subarray
            count += inversionCountDC(arr, mid + 1, h);  //right subarray

            // combine the solution using mergeProcedure
            count += mergeProcedure(arr, l , mid, h);
        }
        return count;
    }
    public static void bruteForce(int[] arr){
        // here the TC: O(n^2)
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[i] > arr[j]){
                    count = count + 1;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int[] arr = {1,5,2,8,3,4};
        bruteForce(arr);
        int n = arr.length;
        // optimal solution using Divide & Conquer Algorithm
        int countOpt = inversionCountDC(arr, 0 , n-1);
        System.out.println("The number of inversion count in an array using Divide and Conquer is: "+countOpt);
    }
}
