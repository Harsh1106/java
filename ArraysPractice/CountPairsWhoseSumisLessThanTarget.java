import java.util.Arrays;

public class CountPairsWhoseSumisLessThanTarget {
    static int countPairs(int arr[], int target) {
        Arrays.sort(arr);
        int count = 0, i = 0, j = arr.length - 1;
        while(i < j){
            int sum = arr[i] + arr[j];
            if(sum < target){
                count += (j - i);
                i++;
            }
            else j--;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 3};
        int target = 8;
        System.out.println(countPairs(arr, target));
    }
}
