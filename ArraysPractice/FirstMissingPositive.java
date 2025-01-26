import java.util.Arrays;

public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        int ans = 1;
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == ans) ans++;
            else if(nums[i] > ans) return ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,0};
        System.out.println(firstMissingPositive(arr));
    }
}