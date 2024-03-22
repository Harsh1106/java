// TC: O(n^2)
// SC: O(1)
import java.util.Arrays;

public class Selection {
    public static void selectionSort(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            int min_index = i; //it is taking the index of minimum element at every iteration.
            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            if(min_index != i){
                // we need to swap between arr[min_idx] && arr[i]
                int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {20,50,12,17,19,25,97,16};
        selectionSort(arr);
        System.out.println("Sorted Array are:");
        System.out.println(Arrays.toString(arr));
    }
}
