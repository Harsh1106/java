public class PairWithGivenSumInASortedArray {
    public static int countPairs(int arr[], int target) {
        int count = 0, i = 0, j = arr.length - 1;
        while(i < j){
            int sum = arr[i] + arr[j];
            if(sum == target){
                int e1 = arr[i], e2 = arr[j], c1 = 0, c2 = 0;
                while(i <= j && arr[i] == e1){
                    i++;
                    c1++;
                }
                while(i <= j && arr[j] == e2){
                    j--;
                    c2++;
                }
                if(e1 == e2) count += (c1 * (c1 - 1))/2;
                else count += (c1 * c2);
            }
            else if(sum > target) j--;
            else i++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {-1, 1, 5, 5, 7};
        int target = 6;
        System.out.println(countPairs(arr, target));
    }
}
