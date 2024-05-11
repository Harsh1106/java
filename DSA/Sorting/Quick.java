// it is a inplace algorithm
// SC: O(1)
// Not a stable algorithm
// TC: O(nlogn) -> worst case
// TC: O(n^2) -> best case

public class Quick {
    public static int partition(int[] arr, int l, int h){
        int i = l;
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
    public static void quickSort(int[] arr, int l, int h){
        if(l < h){
            //1. divide the array into subproblems
            int m = partition(arr, l, h);
            //2. conquer those subproblems via recursion
            quickSort(arr, l, m-1);
            quickSort(arr, m+1, h);
        }
    }
    public static void printArr(int[] arr, int n){
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {50,20,70,90,10,13,17,21};
        int n = arr.length;
        System.out.println("Array before sorting:");
        printArr(arr,n);
        quickSort(arr,0,n-1);
        System.out.println("Array after sorting:");
        quickSort(arr,0,n-1);
        printArr(arr, n);
    }
}
