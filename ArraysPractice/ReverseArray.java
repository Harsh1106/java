// TC= O(n)
// SC = O(1)

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {14,12,10,8,4,2};
        for(int i = 0 ; i < arr.length/2 ; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println("Reversal of an array is:");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}