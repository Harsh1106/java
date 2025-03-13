import java.util.Arrays;
public class ZeroArrayTransformation2{
    public static int minZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        if (Arrays.stream(nums).allMatch(x -> x == 0)) return 0;
        int left = 1, right = queries.length;
        if (!canMakeZeroArray(right, nums, queries)) return -1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canMakeZeroArray(mid, nums, queries)) right = mid;
            else left = mid + 1;
        }
        return left;
    }
    private static boolean canMakeZeroArray(int k, int[] nums, int[][] queries) {
        int n = nums.length;
        int[] diff = new int[n + 1];
        for (int i = 0; i < k; i++) {
            int left = queries[i][0], right = queries[i][1], val = queries[i][2];
            diff[left] += val;
            diff[right + 1] -= val;
        }
        int currVal = 0;
        for (int i = 0; i < n; i++) {
            currVal += diff[i];
            if (currVal < nums[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {4,3,2,1};
        int[][] queries = {{1,3,2}, {0,2,1}};
        System.out.println(minZeroArray(nums, queries));
    }
}