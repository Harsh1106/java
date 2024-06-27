// Recurrence relation: 2T(n/2) + n
// TC: O(nlogn)
// SC: O(n)
// it is a outplace algo bcoz it takes extra space for sorting 

public class Merge{
    // method to do the combine task in merge sort which is merge procedure
    // l = left index
    // r = right index
    public static void mergeProcedure(int[] arr, int l, int mid, int r){
        int i,j,k;
        // to get number of elements from array: (r - l + 1) -> a general formula
        int n1 = mid - l + 1;//size of left subarray
        int n2 = r - mid; //size of right subarray


        // create left and right subarray
        int[] lsubarray = new int[n1];
        int[] rsubarray = new int[n2];

        // copy the data into the right and left subarray
        for(i = 0 ; i < n1 ; i++){
            lsubarray[i] = arr[l + i];
        }
        for(j = 0 ; j < n2 ; j++){
            rsubarray[j] = arr[mid + 1 + j];
        }

        // comparison between the elements in left and right subarray
        i = 0;
        j = 0;
        k = l;

        while(i < n1 && j < n2){
            if(lsubarray[i] <= rsubarray[j]){
                arr[k] = lsubarray[i];
                i = i + 1;
            }
            else{
                arr[k] = rsubarray[j];
                j = j + 1; 
            }
            k = k + 1;
        }

        // copying all the remaining elements from the subarrays
        while(i < n1){
            arr[k] = lsubarray[i];
            i = i + 1;
            k = k + 1;
        }

        // copying all the elements from the right subarrays
        while(j < n2){
            arr[k] = rsubarray[j];
            j = j +1;
            k = k + 1;
        }
    }

    // method to perform the sorting
    public static void mergeSort(int[] arr, int i, int j){
        if(i < j){
            // 1. Divide the array into two subproblem
            int mid = i + (j - i)/2;
            // 2. Conquer the subproblems using recursion
            mergeSort(arr, i, mid); //left subarray
            mergeSort(arr, mid + 1, j); //right subarray

            // 3. Combine the solution of all subproblems
            mergeProcedure(arr, i, mid, j);
        }
    }
// method to display the array
    public static void printArr(int[] arr, int n){
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {50,20,40,90,88,11,13};
        int n = arr.length;

        System.out.println("Array before sorting is: ");
        printArr(arr, n);

        mergeSort(arr, 0, n-1);
        System.out.println();
        System.out.println("Array after sorting is:");
        printArr(arr,n);
    }
}