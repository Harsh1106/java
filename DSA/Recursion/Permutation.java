import java.util.*;

class Solution {
    public void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums)
    {
        if(temp.size() == nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(temp.contains(nums[i]))
                continue;
            temp.add(nums[i]);
            backtrack(result, temp, nums);
            temp.remove(temp.size() - 1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<Integer>(), nums);
        return result;
    }
}

public class Permutation{

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage:
        int[] nums = {1, 2, 3};
        List<List<Integer>> permutations = solution.permute(nums);

        System.out.println("Permutations of the array:");
        for (List<Integer> permutation : permutations) {
            System.out.println(permutation);
        }
    }
}
