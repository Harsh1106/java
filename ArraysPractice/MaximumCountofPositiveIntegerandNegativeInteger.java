public class MaximumCountofPositiveIntegerandNegativeInteger {
    public static int maximumCount(int[] nums) {
        int neg = 0, pos = 0;
        for(int num : nums){
            if(num > 0) pos++;
            else if(num < 0) neg++; 
        }
        return Math.max(pos, neg);
    }
    public static void main(String[] args) {
        int[] nums = {-2,-1,-1,1,2,3};
        System.out.println(maximumCount(nums));
    }
}
