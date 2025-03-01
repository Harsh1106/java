public class MinimumOperationstoExceedThresholdValue1 {
    public static int minOperations(int[] nums, int k) {
        int count = 0;
        for(int num : nums){
            count += (num < k) ? 1 : 0;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {2,11,10,1,3};
        int k = 10;
        System.out.println(minOperations(nums, k));
    }
}
