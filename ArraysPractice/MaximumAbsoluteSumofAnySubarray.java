public class MaximumAbsoluteSumofAnySubarray {
    public static int maxAbsoluteSum(int[] nums) {
        int max_sum = 0, min_sum = 0, max_ending_here = 0, min_ending_here = 0;
        for (int num : nums) {
            max_ending_here += num;
            min_ending_here += num;
            max_sum = Math.max(max_sum, max_ending_here);
            min_sum = Math.min(min_sum, min_ending_here);
            if (max_ending_here < 0) max_ending_here = 0;
            if (min_ending_here > 0) min_ending_here = 0;
        }
        return Math.max(max_sum, Math.abs(min_sum));
    }
    public static void main(String[] args) {
        int[] nums = {1, -3, 2, 3, -4};
        System.out.println(maxAbsoluteSum(nums));
    }
}
