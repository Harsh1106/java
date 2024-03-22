public class PrefixSum {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        for(int i = 1 ; i < arr.length ; i++){
            arr[i] = arr[i] + arr[i-1];
        }
        System.out.println("After operation the array will be:");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
