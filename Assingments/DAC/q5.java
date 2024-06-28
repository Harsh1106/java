import java.util.Arrays;
import java.util.Comparator;

public class q5 {
    public static boolean intersection(int[][] arr){
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i][0] <= arr[i-1][1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {7, 9}, {4, 6}, {10, 13}};
        if(intersection(arr)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
