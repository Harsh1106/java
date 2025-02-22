import java.util.*;
public class SortArraybyIncreasingFrequency {
    public static int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        Integer temp[] = new Integer[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            temp[i] = nums[i];
        }
        Arrays.sort(temp, new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                if(map.get(a) == map.get(b)){
                    return b - a; //dec order of value
                }
                return map.get(a) - map.get(b); //inc order of value
            }
        });
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = temp[i];
        }
        return nums;
    }
    public static void main(String[] args){
        int[] arr = {1,1,2,2,2,3};
        frequencySort(arr);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
