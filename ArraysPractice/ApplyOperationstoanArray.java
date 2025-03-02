public class ApplyOperationstoanArray {
    public static int[] applyOperations(int[] nums) {
        int[] result = new int[nums.length];
        int count = 0, i;
        for(i = 0; i < nums.length - 1; i++){
            if(nums[i] != 0){
                if(nums[i] == nums[i + 1]){
                    result[count] = nums[i] * 2;
                    i++;
                }
                else{
                    result[count] = nums[i];
                }
                count++;
            }
        }
        if(i != nums.length){
            result[count] = nums[nums.length - 1];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,1,1,0};
        int[] result = applyOperations(nums);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
