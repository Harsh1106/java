// TC: O(logn) -> base 2
// SC: O(logn)

import java.util.Scanner;

public class BinarySearch {
    public static int idxFound(int[] arr, int start, int end, int target){ 
        int idx = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            // condition 1
            if(arr[mid] == target){
                return mid;
            }
            // condition 2
            else if(arr[mid] > target){
                return idxFound(arr, start, mid - 1, target); //recursive call
            }
            // condition 3
            else{
                return idxFound(arr, mid + 1, end, target); //recursive call
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,4,6,8,10,12};
        System.out.println("Enter the target:");
        int target = sc.nextInt();

        int res = idxFound(arr, 0, arr.length, target);
        System.out.println("Target's index is: "+res);
    }
}
