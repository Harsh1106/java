// TC = O(n)
// SC = O(1)
public class Reverse {
    public static void rev(int arr[]){
        int temp = 0; 
        int n = arr.length;
        for(int i = 0 ; i < n / 2 ; i++){
            temp = arr[n-i-1];
            arr[n-i-1] = arr[i];
            arr[i] = temp;
        }
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,8,10,12,14};
        rev(arr);
    }
}
