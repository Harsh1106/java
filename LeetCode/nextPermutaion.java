import java.util.*;
public class nextPermutaion {
    public static void rev(int[] arr, int left, int right)
    {
        if(arr[left] > right)
        {
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
        }
    }
    public static void nextPermutation(int[] arr) 
    {
        int idx = -1;
        int n = arr.length;
        for(int i = n - 2 ; i >=  0 ; i--){
            if(arr[i] < arr[i+1]){
                idx = i;
                break;
            }
        }
        if(idx == -1){
            Arrays.sort(arr);
            return;
        }
        for(int i = n - 1 ; i >= idx ; i--){
            if(arr[i] > arr[idx]){
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] =  temp;
                break;
            }
        }
        rev(arr, idx + 1, n - 1);
    }
    public static void main(String[] args) {
        int[] arr = {2,3,1};
        nextPermutation(arr);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
