import java.util.LinkedHashMap;

public class MinimumCommonValue{
    public static int getCommon(int[] nums1, int[] nums2) {
        LinkedHashMap<Integer, Boolean> map = new LinkedHashMap<>();
        for(int num : nums1){
            map.put(num, true);
        }
        for(int num : nums2){
            if(map.containsKey(num)) return num;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4};
        System.out.println(getCommon(nums1, nums2));
    }
}