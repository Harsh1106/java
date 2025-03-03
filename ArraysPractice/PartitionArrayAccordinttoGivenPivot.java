public class PartitionArrayAccordinttoGivenPivot {
    public static int[] pivotArray(int[] nums, int pivot) {
        int sCount = 0, bCount = 0, pCount = 0;
        for(int num : nums){
            if(num < pivot) sCount++;
            else if(num == pivot) pCount++;
            else bCount++;
        }
        int i = 0, j = sCount, k = sCount + pCount;
        int[] res = new int[nums.length];
        for(int num : nums){
            if(num < pivot) res[i++] = num;
            else if(num == pivot) res[j++] = num;
            else res[k++] = num;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {9,12,5,10,14,3,10};
        int pivot = 10;
        int[] result = pivotArray(nums, pivot);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
