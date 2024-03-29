import java.util.Scanner;

public class searchMatrix {
    public static boolean search(int[][] arr, int target){
        int m = arr.length;
        int n = arr[0].length;
        int start = 0, end = m * n - 1;
        int mid = 0, midElement = 0, rowIdx = 0, colIdx = 0;
        while(start <= end){
            mid = start + (end - start)/2;
            rowIdx = mid / n;
            colIdx = mid % n;
            midElement = arr[rowIdx][colIdx];
            if(midElement == target){
                return true;
            }
            else if(midElement > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[][] ={{1,3,5,7},
                      {10,11,16,20},
                      {23,30,34,60}};
        System.out.println("Enter the target:");
        int target = sc.nextInt();
        int low = 0;
        int high = num.length * num[0].length - 1;
        boolean res = search(num, target);
        if(res == true){
            System.out.println("Element is present.");
        }
        else{
            System.out.println("Element is not present.");
        }
    }
}
