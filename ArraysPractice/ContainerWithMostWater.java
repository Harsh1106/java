public class ContainerWithMostWater {
    public static int maxWater(int arr[]) {
        int ans = 0, left = 0, right = arr.length - 1;
        while(left < right){
            int w = right - left;
            int ht = Math.min(arr[left], arr[right]) * w;
            ans = Math.max(ans, ht);
            if(arr[left] < arr[right]) left++;
            else right--;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 3};
        System.out.println(maxWater(arr));
    }
}
