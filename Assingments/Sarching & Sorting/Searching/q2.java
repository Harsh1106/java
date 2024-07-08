import java.util.Scanner;

public class q2 {
    public static int occ(int[] arr, int search){
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
        int[] arr = {1,1,1,1,2,3,4,4,5,6,6,6,6};
        int search = sc.nextInt();
        int index = occ(arr, search);
        System.out.println(index);
    }
}       
