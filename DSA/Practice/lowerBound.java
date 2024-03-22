import java.util.*;
public class lowerBound {
    public static int firstOccurence(int[] arr, int element){
        int loc = 0;
        int low = 0, high = arr.length - 1;
        int mid = 0;
        while(low <= high){
            mid = low + (high - low)/2;
            if(arr[mid] == element){
                loc = mid;
                high = mid - 1;
            }else if(arr[mid] < element){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return loc;
    }
    public static int lastOccurence(int[] arr, int element){
        int loc = 0;
        int low = 0, high = arr.length - 1;
        int mid = 0;
        while(low <= high){
            mid = low + (high - low)/2;
            if(arr[mid] == element){
                loc = mid;
                low = mid + 1;
            }else if(arr[mid] < element){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return loc;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,4,7,7,9,12,14};
        System.out.println("Enter the element you want to get the lower bound: ");
        int element = sc.nextInt();

        // TC: O(n)
        // for(int i = 0 ; i < arr.length ; i++){
        //     if(arr[i] == element){
        //         System.out.println("Lower bound of element is: "+i);
        //         break;
        //     }
        // }
        // System.out.println("Element is not present!");


        // It is a modification of binary search
        // TC: O(logN) 
        // SC: O(1)
        int first = firstOccurence(arr, element);
        int last = lastOccurence(arr, element);
        
        System.out.println("["+first+","+last+"]");
    }
}
