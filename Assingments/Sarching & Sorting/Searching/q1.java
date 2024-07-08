import java.util.Arrays;
import java.util.Scanner;
public class q1{
    public static int findIndex(int[] arr, int search){
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == search){
                return mid;
            }else if(arr[mid] > search){
                high = mid - 1;
            }else{
                low = mid + 1; 
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element you want to add: ");
        int num = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] arr = new int[num];
        for(int i = 0 ; i < num ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the elements to be searched in array: ");
        int search = sc.nextInt();
        Arrays.sort(arr);
        int index = findIndex(arr, search);
        if(index == -1){
            System.out.println("Element not found in array");
        }else{
            System.out.println(index);
        }
    }
} 