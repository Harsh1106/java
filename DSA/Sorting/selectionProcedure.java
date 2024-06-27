//TC: O(n) for best case and for worst case O(n^2)
// SC: O(1)

import java.util.Scanner;

public class selectionProcedure {
    public static int partition(int[] arr, int l, int h){
        int i = l;
        // considering the pivot as the first element in the array
        int pivot = arr[l];
        for(int j = l + 1 ; j <= h ; j++){
            // j -> to take care of the bigger elements than the pivot
            // i -> to take care of the smaller elements than the pivot
            if(arr[j] <= pivot){
                i = i + 1; //increment i
                // swap(arr[i], arr[j]);
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // final swap
        // swap(arr[l], arr[i])-> to return the correct index of pivot
        int temp = arr[l];
        arr[l] = arr[i];
        arr[i] = temp;
        return i;
    }

    // function to implement the kth smallest element finding in an array
    public static int selectionProcedure(int[] arr, int l, int h, int k){
        //applied the Division of array by using the partition algorithm
        int m = partition(arr, l, h);
        // relationship between index number & position number
        if(m == k - 1){
            return arr[m];
        }
        if(m < k - 1){ //right side of an array
            return selectionProcedure(arr, m + 1, h, k);
        }
        else{//left side of an array
            return selectionProcedure(arr, l, m - 1, k);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {50,30,70,90,10,34,89,98,13};
        int n = arr.length;
        System.out.print("Enter the index you want to search: ");
        int k = sc.nextInt();
        int result = selectionProcedure(arr, 0, n-1, k);
        System.out.println("kth smallest element in an array is: "+result);
    }
}
