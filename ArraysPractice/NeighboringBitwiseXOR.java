public class NeighboringBitwiseXOR {
    public static boolean doesValidArrayExist(int[] derived) {
        int ans = 0;
        for(int num : derived){
            ans ^= num;
        }
        return (ans == 0);
    }
    public static void main(String[] args) {
        int[] arr = {1,1,0};
        System.out.println(doesValidArrayExist(arr));
    }
}
