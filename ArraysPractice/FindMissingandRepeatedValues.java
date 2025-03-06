import java.util.HashMap;

public class FindMissingandRepeatedValues {
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length, total = n * n;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                int num = grid[i][j];
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        int repeating = -1, missing = -1;
        for(int i = 1 ; i <= total ; i++){
            if(map.getOrDefault(i, 0) == 2) repeating = i;
            else if(!map.containsKey(i)) missing = i;  
        }
        return new int[] {repeating, missing};
    }
    public static void main(String[] args) {
        int[][] grid = {{1,3}, {2,2}};
        int[] result = findMissingAndRepeatedValues(grid);
        System.out.println("Repeating number: " + result[0] + ", Missing number: " + result[1]);
    }
}
