import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumPairClosestToTarget {
    public static List<Integer> sumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        int i = 0, j = arr.length - 1, first = -1, second = -1, diff = Integer.MAX_VALUE;
        while(i < j){
            int sum = arr[i] + arr[j];
            if(diff > Math.abs(sum - target)){
                first = arr[i];
                second = arr[j];
                diff = Math.abs(sum - target);
            }
            else if(diff == Math.abs(sum - target)){
                if(arr[j] - arr[i] > second - first){
                    first = arr[i];
                    second = arr[j];
                }
            }
            if(sum <= target) i++;
            else j--;
        }
        if(first == -1 && second == -1) return new ArrayList<Integer>();
        return new ArrayList<>(Arrays.asList(first, second));
    }
    public static void main(String[] args) {
        int[] arr = {10, 30, 20, 5};
        int target = 25;
        System.out.println(sumClosest(arr, target));
    }
}
