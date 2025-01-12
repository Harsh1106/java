public class TrappingRainWater {
    public static int maxWater(int arr[]) {
        int left = 1, right = arr.length - 2, lmax = arr[left - 1], rmax = arr[right + 1];
        int res = 0;
        while(left <= right){
            if(rmax <= lmax){
                res += Math.max(0, rmax - arr[right]);
                rmax = Math.max(rmax, arr[right]);
                right--;
            }
            else{
                res += Math.max(0, lmax - arr[left]);
                lmax = Math.max(lmax, arr[left]);
                left++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 0, 4, 0, 2};
        System.out.println(maxWater(arr));
    }
}
