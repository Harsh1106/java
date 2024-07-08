import java.util.Scanner;

public class q4 {
    public static int count(int[] arr, int target){
        int firstOccurence = firstOccurence(arr, target);
        int lastOccurence = lastOccurence(arr, target);
        if(firstOccurence == -1){
            return 0;
        }
        return lastOccurence - firstOccurence + 1;
    }

    public static int firstOccurence(int[] arr, int target){
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if(arr[mid] == target && (mid == 0 || arr[mid - 1] != target)){
                return mid;
            }else if(arr[mid] >= target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int lastOccurence(int[] arr, int target){
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target && (mid == arr.length - 1 || arr[mid + 1] != target)){
                return mid;
            }else if(arr[mid] <= target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int target = sc.nextInt();
        int num = count(arr, target);
        System.out.println("Target "+target+" occurs "+num+" times");
    }
}
