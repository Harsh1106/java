import java.util.*;
class Solution {
    public void backtrack(List<List<Integer>> res, List<Integer> temp, int[] arr, int target, int start)
    {
        if(target < 0){
            return;
        }else if(target == 0){
            res.add(new ArrayList<>(temp));
        }
        for(int i = start ; i < arr.length ; i++){
            temp.add(arr[i]);
            backtrack(res, temp, arr, target - arr[i], i);
            temp.remove(temp.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), candidates, target, 0);
        return res;
    }
}

public class CombinationSum {

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage:
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> combinations = solution.combinationSum(candidates, target);

        System.out.println("All combinations that sum up to " + target + " are:");
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }
}

